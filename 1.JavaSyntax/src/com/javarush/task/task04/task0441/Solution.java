package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] nums = new int[3];
        Scanner in = new Scanner(System.in);
        for(int i=0;i<nums.length;i++) nums[i] = in.nextInt();
        Arrays.sort(nums);
        System.out.println(nums[1]);
    }
}
