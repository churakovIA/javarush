package com.javarush.task.task07.task0705;

import java.util.Arrays;
import java.util.Scanner;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] ints = new int[20];
        int[] ints1 = new int[10];
        int[] ints2 = new int[10];

        Scanner in = new Scanner(System.in);
        for(int i=0;i<ints.length;i++) ints[i] = in.nextInt();
//        ints = new int[]{2,4,8,5,6,1,0,9,3,11};

        ints1 = Arrays.copyOfRange(ints, 0, ints.length/2-1);
        ints2 = Arrays.copyOfRange(ints, ints.length/2, ints.length);

        for(int i=0;i<ints2.length;i++) System.out.println(ints2[i]);

    }
}
