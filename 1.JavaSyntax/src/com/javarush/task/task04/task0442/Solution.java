package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        for (int x = 0; x != -1; x = in.nextInt(), sum += x) {}
        System.out.println(sum);
    }
}
