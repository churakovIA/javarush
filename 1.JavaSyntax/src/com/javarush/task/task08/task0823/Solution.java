package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String s = reader.readLine();
        String s = "мама мыла раму.";
        for (String st : s.split("\\b")) System.out.print(st.substring(0,1).toUpperCase()+st.substring(1));


/*
        //напишите тут ваш код
        StringBuilder res = new StringBuilder();

        StringTokenizer tokenizer = new StringTokenizer(s, " ");
        while (tokenizer.hasMoreElements()) {
            //res = res.join(tokenizer.nextToken()) + " ";
            String word = tokenizer.nextToken();
            System.out.println();
            res.append(word.substring(0,1).toUpperCase());
            res.append(word.substring(1));
            res.append(" ");
            //res = res + word.replace(word.charAt(0), Character.toUpperCase(word.charAt(0))) + " ";
            //System.out.println(tokenizer.nextToken());
        }

        System.out.println(res);
*/
    }
}
