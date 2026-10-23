package org.leetcode.requests;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.leetcode.dto.FavoriteList;
import org.leetcode.dto.LearningContextResponse;
import org.leetcode.dto.ProblemsetQuestionListV2;
import org.leetcode.dto.QuestionOfToday;
import org.leetcode.dto.RandomQuestion;
import org.leetcode.dto.SolvedProblemList;
import org.leetcode.queries.Queries;

import tools.jackson.databind.ObjectMapper;

/**
 * Client
 */
public class Client {

  StringBuilder res = new StringBuilder();
  ObjectMapper objectMapper = new ObjectMapper();
  ProblemsetQuestionListV2 problemsetQuestionListV2;

  private String getResponse(String POSTBody) {
    try (HttpClient client = HttpClient.newBuilder().build();) {

      HttpRequest request = HttpRequest.newBuilder()
          .uri(URI.create("https://leetcode.com/graphql"))
          .header("content-type", "application/json")
          .header("Cookie", System.getenv("LEETCODE_COOKIE"))
          .header("x-csrftoken", System.getenv("LEETCODE_CSRF"))
          .header("Origin", "https://leetcode.com/")
          .header("Referer", "https://leetcode.com/problemset/")
          .header("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:160.0) Gecko/20100101 Firefox/160.0")
          .POST(HttpRequest.BodyPublishers.ofString(POSTBody))
          .build();

      HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
      return String.valueOf(response.body());
    } catch (Exception e) {
      return String.valueOf(e.getStackTrace());
    }
  }

  private String getjsoupResponse(String title) throws IOException {
    Document doc = Jsoup.connect("https://leetcode.com/problems/" + title + "/description")
        .header("content-type", "application/json")
        .header("Cookie", System.getenv("LEETCODE_COOKIE"))
        .header("x-csrftoken", System.getenv("LEETCODE_CSRF"))
        .header("Origin", "https://leetcode.com/")
        .header("Referer", "https://leetcode.com")
        .header("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:160.0) Gecko/20100101 Firefox/160.0")
        .get();
    Element meta = doc.selectFirst("meta[name=description]");
    String content = Parser.unescapeEntities(meta.attr("content"), false);
    return content;
  }

  private String getjsoupResponseForAURL(String url) throws IOException {
    Document doc = Jsoup.connect("https://leetcode.com" + url)
        .header("content-type", "application/json")
        .header("Cookie", System.getenv("LEETCODE_COOKIE"))
        .header("x-csrftoken", System.getenv("LEETCODE_CSRF"))
        .header("Origin", "https://leetcode.com/")
        .header("Referer", "https://leetcode.com/problemset/")
        .header("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:160.0) Gecko/20100101 Firefox/160.0")
        .get();
    Element meta = doc.selectFirst("meta[name=description]");
    String content = Parser.unescapeEntities(meta.attr("content"), false);
    return content;
  }

  public String getProblemList() {

    for (int i = 0; i < 50; i++) {
      problemsetQuestionListV2 = objectMapper
          .readValue(getResponse(Queries.getProblemsetQuestionListV2(i * 100)), ProblemsetQuestionListV2.class);

      problemsetQuestionListV2.getData().getProblemsetQuestionListV2().getQuestions().stream()
          .forEach(x -> res.append(x.getTitle()).append("\n"));
    }

    return res.toString();
  }

  public String getSolvedProblemList() {
    SolvedProblemList solvedProblemList = objectMapper
        .readValue(getResponse(Queries.getSolvedProblems()), SolvedProblemList.class);
    solvedProblemList.getData().getProblemsetQuestionListV2().getQuestions()
        .forEach(x -> res.append(x.getTitle()).append("\n"));
    return res.toString();
  }

  public String getRandomQuestion() throws IOException {
    RandomQuestion randomQuestion = objectMapper.readValue(getResponse(Queries.getRandomQuesiton()),
        RandomQuestion.class);
    String title = randomQuestion.getData().getRandomQuestionV2().getTitleSlug();
    return getjsoupResponse(title);
  }

  public String getPrevQuesiton(String currentQuestion) throws IOException {
    LearningContextResponse learningContextResponse = objectMapper
        .readValue(getResponse(Queries.getLearningContext(currentQuestion)), LearningContextResponse.class);
    return getjsoupResponse(
        learningContextResponse.getData().getLearningContextV2().getPreviousQuestion().getTitleSlug());
  }

  public String getProblemDescription() {
    return null;
  }

  public String getNextQuesiton(String currentQuestion) throws IOException {
    LearningContextResponse learningContextResponse = objectMapper.readValue(
        getResponse(Queries.getLearningContext(currentQuestion)),
        LearningContextResponse.class);
    String res = getjsoupResponse(
        learningContextResponse.getData().getLearningContextV2().getNextQuestion().getTitleSlug());
    return res;
  }

  public String getQuestionOfToday() throws IOException {
    QuestionOfToday questionOfToday = objectMapper.readValue(getResponse(Queries.getQuestionOfToday()),
        QuestionOfToday.class);
    String url = questionOfToday.getData().getActiveDailyCodingChallengeQuestion().getLink();
    return getjsoupResponseForAURL(url);
  }

  public String getProblem(String title) throws IOException {
    return getjsoupResponse(title);
  }

  public String getFavoriteList(String listName) {
    FavoriteList favouriteList = objectMapper.readValue(getResponse(Queries.getFavoriteList(listName)),
        FavoriteList.class);
    favouriteList.getData().getFavoriteQuestionList().getQuestions()
        .forEach(x -> res.append(x.getTitle()).append("\n"));
    //
    return res.toString();
  }
}
