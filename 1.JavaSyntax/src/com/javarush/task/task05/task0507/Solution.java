package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.util.IntSummaryStatistics;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        IntSummaryStatistics stats = new IntSummaryStatistics();
        while (true) {
            int a = in.nextInt();
            if (a == -1) break;
            else stats.accept(a);
        }
        System.out.println(stats.getAverage());
    }
}

