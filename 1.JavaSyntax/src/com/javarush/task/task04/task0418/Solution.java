package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(Math.min(a,b));
    }
}