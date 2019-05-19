package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] nums = new int[5];
        //Scanner in = new Scanner(System.in);
        for(int i=0;i<nums.length;i++) nums[i] = Integer.parseInt(reader.readLine());
        Arrays.sort(nums);
        for(int n: nums) System.out.println(n);
    }
}
