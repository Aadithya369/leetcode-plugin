package org.leetcode;

import org.leetcode.parsers.ProblemsetQuestionListV2;
import org.leetcode.parsers.QuestionDetailResponse;
import org.leetcode.parsers.QuestionOfToday;
import org.leetcode.requests.Client;
import tools.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException, InterruptedException, ClassNotFoundException,
      IllegalAccessException, InvocationTargetException, NoSuchMethodException {
    Client client = new Client();
    Scanner sc = new Scanner(System.in);
    String q = sc.nextLine();
    String params = sc.nextLine();
    String response = client.getResponse(q, params);
    // System.out.println(response);

    if (response.isEmpty()) {
      System.out.println("params are missing");
      System.exit(0);
    }

    ObjectMapper objectMapper = new ObjectMapper();
    switch (q) {
      case "1":
        ProblemsetQuestionListV2 problemList = objectMapper.readValue(response, ProblemsetQuestionListV2.class);
        problemList.getData().getProblemsetQuestionListV2().getQuestions()
            .forEach(x -> System.out.println(x.getId() + ". " + x.getTitle()));
        break;
      case "2":
        QuestionOfToday questionOfToday = objectMapper.readValue(response, QuestionOfToday.class);
        System.out.println(questionOfToday.getData().getActiveDailyCodingChallengeQuestion().getLink());
        break;
      case "3":
        QuestionDetailResponse questionDetailResponse = objectMapper.readValue(response, QuestionDetailResponse.class);
        System.out.println(questionDetailResponse.getData().getQuestion().getContent());
    }
    sc.close();
  }
}
