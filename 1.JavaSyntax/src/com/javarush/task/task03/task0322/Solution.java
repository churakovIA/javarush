package com.javarush.task.task03.task0322;


/* 
Большая и чистая
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //Вася + Ева + Анжелика = Чистая любовь, да-да!
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder s = new StringBuilder();
        s.append(in.readLine());
        s.append(" + ");
        s.append(in.readLine());
        s.append(" + ");
        s.append(in.readLine());
        s.append(" = Чистая любовь, да-да!");
        System.out.println(s);
    }
}