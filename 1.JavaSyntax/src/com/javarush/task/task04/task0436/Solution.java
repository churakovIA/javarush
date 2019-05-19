package com.javarush.task.task04.task0436;


/* 
Рисуем прямоугольник
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        for(int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) System.out.print(8);
            System.out.println();
        }

    }
}
