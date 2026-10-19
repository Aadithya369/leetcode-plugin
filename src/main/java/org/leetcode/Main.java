package org.leetcode;

import org.leetcode.dto.LearningContextResponse;
import org.leetcode.dto.ProblemsetQuestionListV2;
import org.leetcode.dto.QuestionDetailResponse;
import org.leetcode.dto.QuestionOfToday;
import org.leetcode.requests.Client;
import org.leetcode.requests.HtmlClient;

import tools.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class Main {
  public static void main(String[] args) throws IOException, InterruptedException, ClassNotFoundException,
      IllegalAccessException, InvocationTargetException, NoSuchMethodException {
    Client client = new Client();
    String response = client.getResponse(args[0], args[1]);
    // System.out.println(response);

    if (response.isEmpty()) {
      System.out.println("params are missing");
      System.exit(0);
    }

    ObjectMapper objectMapper = new ObjectMapper();
    switch (args[0]) {
      case "1":
        ProblemsetQuestionListV2 problemList = objectMapper.readValue(response, ProblemsetQuestionListV2.class);
        problemList.getData().getProblemsetQuestionListV2().getQuestions()
            .forEach(x -> System.out.println(x.getQuestionFrontendId() + ". " + x.getTitle()));
        break;
      case "2":
        QuestionOfToday questionOfToday = objectMapper.readValue(response, QuestionOfToday.class);
        String url = questionOfToday.getData().getActiveDailyCodingChallengeQuestion().getLink();
        System.out.println(new HtmlClient().getHtmlResponse(url));
        break;
      case "3":
        QuestionDetailResponse questionDetailResponse = objectMapper.readValue(response, QuestionDetailResponse.class);
        questionDetailResponse.getData().getQuestion().getCodeSnippets().stream()
            .filter(x -> x.getLangSlug().equals(args[2]))
            .forEach(x -> System.out.println(x.getCode()));
        break;
      case "4":
        LearningContextResponse learningContextResponse = objectMapper.readValue(response,
            LearningContextResponse.class);
        System.out.println(learningContextResponse.getData().getLearningContextV2().getNextQuestion().getTitle());
    }
  }
}
