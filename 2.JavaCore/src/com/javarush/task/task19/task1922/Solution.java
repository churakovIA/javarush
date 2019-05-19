package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fname = br.readLine();
        br.close();

        try (BufferedReader in = new BufferedReader(new FileReader(fname))){
            while (in.ready()){
                String str = in.readLine();
                ArrayList<String> list = new ArrayList<>();
                list.addAll(Arrays.asList(str.split(" ")));
                list.retainAll(words);
                if(list.size() == 2) System.out.println(str);
            }
        }
    }
}
