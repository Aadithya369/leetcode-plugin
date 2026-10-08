package org.leetcode;

import org.leetcode.parsers.ProblemList;
import org.leetcode.requests.Client;
import tools.jackson.databind.ObjectMapper;

import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, NoSuchFieldException, InterruptedException, ClassNotFoundException, IllegalAccessException {
        Client client = new Client();

        String respone = client.getResponse(args[0]);

        ObjectMapper mapper = new ObjectMapper();
        ProblemList problemList = mapper.readValue(respone, ProblemList.class);
        System.out.println(problemList.getTitle());



    }
}
