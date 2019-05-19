package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    private static ArrayList<ArrayDeque<String>> arrayDeques = new ArrayList<>();
    private static String regexpstart;
    private static String regexpend;

    public static void main(String[] args) throws IOException {

        String tagname = args[0];
//        String tagname = "span";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String f1 = br.readLine();
//        String f1 = "E:\\trash\\java\\source.txt";
        br.close();

//        String regexp = "<(\"[^\"]*\"|'[^']*'|[^'\">])*>";
//        String regexp = "(?i)<span+>(.+?)</span>";
//        String regexp = "<tag.*?>.*?</tag.*?>".replace("tag", tagname);
        String regexp = "(<tag.*?>)|(</tag.*?>)".replace("tag", tagname);
        regexpstart = "<tag.*?>".replace("tag", tagname);
        regexpend = "</tag.*?>".replace("tag", tagname);
        Pattern pattern = Pattern.compile(regexp);

        try(
                BufferedReader brf1 = new BufferedReader(new FileReader(f1));
        ){

            String line;
            while (brf1.ready()) {
                line = brf1.readLine();
                Matcher matcher = pattern.matcher(line);
                int idx = 0;
                while (matcher.find()){
                    if(idx != matcher.start())
                        eval(line.substring(idx, matcher.start()));
                    eval(matcher.group());
                    idx = matcher.end();
                }
                if(idx < line.length())
                    eval(line.substring(idx, line.length()));
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    private static void eval(String substring) {
        if(substring.matches(regexpstart)){
            ArrayDeque<String> deque = new ArrayDeque<>();
            arrayDeques.add(new ArrayDeque<>());
            arrayDeques.forEach(d -> d.push(substring));
        } else if(substring.matches(regexpend)){
            ArrayDeque<String> d = arrayDeques.get(arrayDeques.size()-1);
            while (!d.isEmpty())
                System.out.print(d.pollLast());
            System.out.print(substring);
            System.out.println();
            arrayDeques.remove(arrayDeques.size()-1);
        } else if(arrayDeques.size() > 0){
            arrayDeques.get(arrayDeques.size()-1).push(substring);
        }
    }
}
