package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int[] m = new int[4];
        for(int i=0;i<m.length;i++) m[i] = in.nextInt();
        int max = m[0];
        for(int n: m) if (n>max) max = n;
        System.out.println(max);
    }
}
