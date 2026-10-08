package org.leetcode.requests;

import java.io.IOException;
import java.lang.reflect.Field;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.HashMap;
import java.util.Map;


public class Client {
    public String getResponse(String id) throws ClassNotFoundException, IOException, InterruptedException, NoSuchFieldException, IllegalAccessException {

        Class<?> clazz = Class.forName("org.leetcode.queries.ProblemsetQuestionListV2");

        Field[] field = clazz.getFields();
        Map<Integer, String> map = new HashMap<>();
        for(int i = 0; i <  field.length; i++) {
            map.put(i + 1, field[i].getName());
            System.out.println(i + 1 + ". "  + field[i].getName());
        }
        String fieldName = map.get(Integer.valueOf(id));
        Field queryField = clazz.getField(fieldName);
        String requestBody = (String) queryField.get(null);

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