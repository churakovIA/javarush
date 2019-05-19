package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //int[] nums = {5,3,1,8,7,9,5};
        int[] nums = new int[3];
        Scanner in = new Scanner(System.in);
        for(int i=0;i<nums.length;i++) nums[i] = in.nextInt();
        Arrays.sort(nums);
//        {
//            int i = 0;
//            while (i < nums.length - 1) {
//                if (nums[i] > nums[i + 1]) {
//                    int temp = nums[i];
//                    nums[i] = nums[i + 1];
//                    nums[i + 1] = temp;
//                    i = 0;
//                } else i++;
//            }
//        }
        for (int i=nums.length-1;i>=0;i--) System.out.print(nums[i]+" ");
        //System.out.println(Arrays.toString(nums));
    }
}
