package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(((new BufferedReader(new InputStreamReader(System.in))).readLine()));
        if (n>0 && n<1000)
            System.out.print((n%2==0 ? "четное ":"нечетное ")+(n<10 ? "однозначное ":n<100 ? "двузначное ":"трехзначное ")+"число");

    }
}
