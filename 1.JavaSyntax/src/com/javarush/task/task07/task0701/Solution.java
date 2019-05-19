package com.javarush.task.task07.task0701;

import java.io.IOException;
import java.util.Scanner;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        Scanner in = new Scanner(System.in);
        int[] ints = new int[20];
        for(int i = 0; i<ints.length;i++) ints[i] = in.nextInt();
        return ints;
    }

    public static int max(int[] array) {
        int m = array[0];
        for(int i = 0; i < array.length;i++)
            if(m < array[i]) m = array[i];
        return m;
    }
}
