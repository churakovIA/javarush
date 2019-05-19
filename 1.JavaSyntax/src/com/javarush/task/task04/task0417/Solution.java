package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] nums = new int[3];
        int[] counter = new int[3];
        Scanner in = new Scanner(System.in);
        for(int i=0;i<nums.length;i++) nums[i] = in.nextInt();
        for(int i=0;i<nums.length;i++) {
            for(int j=0;j<nums.length;j++) {
                if(nums[i]==nums[j]) counter[i]++;
            }
        }
        //System.out.println(Arrays.toString(counter));
        for(int i=0;i<counter.length;i++) if(counter[i]>1) System.out.print(nums[i]+" ");
/*
        for(int i=0;i<nums.length-1;i++)
            for(int j=nums.length-1;j>i;j--) {
                System.out.printf("%s %s\n",i,j);
            }
*/



    }
}