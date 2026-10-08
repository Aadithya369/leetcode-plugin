package org.leetcode;

import org.leetcode.requests.Client;
import tools.jackson.databind.ObjectMapper;

import java.io.IOException;

import static org.leetcode.queries.Queries.problemsetQuestionListV2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, NoSuchFieldException, InterruptedException, ClassNotFoundException, IllegalAccessException {
        Client client = new Client();
        System.out.println(args[0]);
        System.out.println(client.getResponse(args[0]));

        ObjectMapper mapper = new ObjectMapper();

        mapper.readTree(problemsetQuestionListV2);

        System.out.println("Valid JSON");
    }
}
