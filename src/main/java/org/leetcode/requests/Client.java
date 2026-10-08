package org.leetcode.requests;

import java.io.IOException;
import java.lang.reflect.Field;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;



public class Client {
    public static void main(String[] args)
            throws IOException, InterruptedException,
            ClassNotFoundException, NoSuchFieldException,
            IllegalAccessException {

        Class<?> clazz = Class.forName("org.leetcode.queries.Queries");

        Field field = clazz.getField(args[0]);
        String query = String.valueOf(field.get(clazz));

        System.out.println(query);
    }
}