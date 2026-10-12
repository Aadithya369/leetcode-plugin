package org.leetcode.requests;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class Client {
  public String getResponse(String id, String params) throws ClassNotFoundException, IOException, InterruptedException,
      NoSuchMethodException, InvocationTargetException, IllegalAccessException {

    Class<?> clazz = Class.forName("org.leetcode.queries.Queries");
    String methodName = switch (id) {
      case "1" -> "getProblemsetQuestionListV2";
      case "2" -> "getQuestionOfToday";
      case "3" -> "getQuestionDetail";
      case "4" -> "getLearningContext";
      default -> throw new IllegalArgumentException(
          "Invalid query ID: " + id);
    };

    Method queryMethod;
    String result;

    if (params != null && !params.isBlank()) {
      queryMethod = clazz.getMethod(methodName, String.class);
      result = (String) queryMethod.invoke(null, params);
    } else {
      queryMethod = clazz.getMethod(methodName);
      result = (String) queryMethod.invoke(null);
    }

    String requestBody = result.toString();
    if (requestBody.isBlank())
      return "";

    try (HttpClient client = HttpClient.newBuilder().build()) {

      HttpRequest request = HttpRequest.newBuilder()
          .uri(URI.create("https://leetcode.com/graphql/"))
          .header("content-type", "application/json")
          .header("Origin", "https://leetcode.com")
          .header("Referer", "https://leetcode.com/problemset/")
          .header("Cookie", System.getenv("LEETCODE_COOKIE"))
          .header("x-csrftoken", System.getenv("LEETCODE_CSRF"))
          .header("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:159.0) Gecko/20100101 Firefox/159.0")
          .POST(HttpRequest.BodyPublishers.ofString(requestBody))
          .build();

      HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
      return response.body();
    }
  }
}
