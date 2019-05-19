package com.javarush.task.task04.task0437;


/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String all = "8888888888";
        for (int i = 1;i<=10;i++)
            System.out.println(all.substring(10-i));

    }
}
