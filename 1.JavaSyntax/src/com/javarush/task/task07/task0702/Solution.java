package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = new String[10];
        for(int i=0;i<8;i++)
        {
            strings[i] = in.readLine();
        }
        int q = strings.length;
        while (q > 0)
        {
            q--;
            System.out.println(strings[q]);
        }
    }
}