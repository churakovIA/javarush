package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[3];
        for (int i=0;i<nums.length;i++) nums[i] = in.nextInt();
        int p = 0, n = 0;
        for (int a:nums) {
            if (a<0) n++;
            if(a>0) p++;
        }
        System.out.println("количество положительных чисел: " + p);
        System.out.println("количество отрицательных чисел: " + n);
    }
}
