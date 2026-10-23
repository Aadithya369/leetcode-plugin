package org.leetcode;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.leetcode.requests.Client;

public class Main {
  public static void main(String[] args) throws IOException, InterruptedException, ClassNotFoundException,
      IllegalAccessException, InvocationTargetException, NoSuchMethodException {
    Client client = new Client();
    String response = "";
    Object nextQuestion;
    Object prevQuestion;
    String solvedProblemList;
    switch (args[0]) {
      case "1":
        response = client.getProblemList();
        break;
      case "2":
        response = client.getQuestionOfToday();
        break;
      case "3":
        response = client.getProblem(args[1]);
        break;
      case "4":
        response = client.getNextQuesiton(args[1]);
        break;
      case "5":
        response = client.getPrevQuesiton(args[1]);
        break;
      case "6":
        response = client.getSolvedProblemList();
        break;
      case "7":
        response = client.getRandomQuestion();
        break;
      case "8":
        response = client.getFavoriteList(args[1]);
        break;
      default:
        response = "wrong argument";
    }
    System.out.println(response);
  }
}
