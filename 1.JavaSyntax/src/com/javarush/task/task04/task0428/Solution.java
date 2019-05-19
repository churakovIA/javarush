package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[3];
        int count = 0;
        for(int i=0;i<nums.length;i++) {
            if(in.nextInt()>0) count++;
        }
        System.out.println(count);
    }
}
