package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[3];
        int[] unique = new int[3];
        for(int i=0;i<nums.length;i++) nums[i] = in.nextInt();
        //int[] counter = new int[3];
        for(int i=0;i<nums.length;i++) {
            unique[i] = 1;
            for(int j=0;j<nums.length;j++) {
                if(i!=j && nums[i] == nums[j]) {unique[i] = 0; break;}
            }
        }
        //if(unique){System.out.println(i);break;}
        //System.out.println(Arrays.toString(unique));
        int sum = 0;
        int id = -1;
        for (int i=0;i<nums.length;i++) {
            sum+=unique[i];
            if(unique[i]==1) id = i;
        }
        //System.out.println(sum);
        if (sum!=3 && id!=-1) System.out.println(id+1);
    }
}
