package com.javarush.task.task05.task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        int[] nums = new int[count];
        for(int i=0;i<nums.length;i++) nums[i] = Integer.parseInt(reader.readLine());
        Arrays.sort(nums);

        int maximum = nums[nums.length-1];

        System.out.println(maximum);
    }
}
