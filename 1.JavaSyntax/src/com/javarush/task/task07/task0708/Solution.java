package com.javarush.task.task07.task0708;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {

        strings = new ArrayList<String>();

        Scanner in = new Scanner(System.in);
        for(int i=0;i<5;i++) strings.add(in.nextLine());

/*
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<5;i++) {
            String s = in.readLine();
            strings.add(s);
        }
*/


        Collections.sort(strings, (first, second) -> first.length() - second.length());
        Collections.reverse(strings);

        int lastSize = -1;
        for(String s: strings) {
            if(s.length()<lastSize) break;
            else {
                System.out.println(s);
                lastSize = s.length();
            }
        }
    }
}
