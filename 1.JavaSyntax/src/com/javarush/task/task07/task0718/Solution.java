package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<10;i++) list.add(in.readLine());
        for(String nextStr : list) {
            int index = list.indexOf(nextStr);
            if(index > 0 && nextStr.length() < list.get(index-1).length()) {
                System.out.println(index);
                break;
            }
        }
    }
}

