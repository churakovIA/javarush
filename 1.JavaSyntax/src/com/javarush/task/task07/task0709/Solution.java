package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        //объявление списка строк
        ArrayList<String> list = new ArrayList<>();

        int min = Integer.MAX_VALUE;

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<5;i++) {
            String nextStr = in.readLine();
            list.add(nextStr);
            if(nextStr.length() < min) min = nextStr.length();
        }

        for(String nextStr: list)
            if(nextStr.length() == min) System.out.println(nextStr);

    }
}
