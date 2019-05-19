package com.javarush.task.task22.task2209;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
Составить цепочку слов
*/
public class Solution {
    public static void main(String[] args) throws Exception{
        String filename = "E:\\trash\\java\\source.txt";

        try (Scanner sc = new Scanner(System.in)){
//            filename = sc.nextLine();
        } catch (Exception e) {
            throw e;
        }

        String content = new String (Files.readAllBytes(Paths.get(filename)));

        StringTokenizer stringTokenizer = new StringTokenizer(content);
        String[] m = new String[stringTokenizer.countTokens()];

        for(int i = 0; i < m.length; i++)
            m[i] = stringTokenizer.nextToken();

        //...
        StringBuilder result = getLine(m);
        System.out.println(result.toString());
    }

    public static StringBuilder getLine(String... words) {

        Arrays.sort(words, (f, s) -> { return f.substring(f.length()-1).equalsIgnoreCase(s.substring(0, 1)) ? -1: 1;});

        StringBuilder res = new StringBuilder();
        Arrays.asList(words).forEach(s -> res.append(s+" "));

        return res;
    }
}
