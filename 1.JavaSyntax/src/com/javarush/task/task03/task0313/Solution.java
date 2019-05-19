package com.javarush.task.task03.task0313;

/* 
Мама мыла раму
*/

public class Solution {
    public static void main(String[] args) {
        String[] orig = {"Мама", "Мыла", "Раму"};
        int n = orig.length;
        int[] P = new int[n];
        int[] C = new int[n];
        boolean[] PR = new boolean[n];
        for(int i = 0;i<n;i++){
            P[i] = i+1;
            C[i] = 1;
            PR[i] = true;
        }
        print(P, orig);
        int i = 1;
        while(i < n) {
            i = 1;
            int x = 0;
            while (i < n && C[i-1] == n - i + 1) {
                PR[i-1] = ! PR[i-1];
                C[i-1] = 1;
                if(PR[i-1]) x++;
                i++;
            }
            if(i < n) {
                int k = PR[i-1] ? (C[i-1] + x) : (n - i + 1 - C[i-1] + x);

                int temp = P[k-1];
                P[k-1] = P[k];
                P[k] = temp;

                print(P, orig);

                C[i-1]++;
            }
        }
    }
    static void print(int[] M, String[] orig){
        StringBuilder res = new StringBuilder("");
        for (int el: M) res.append(orig[el-1]);
        System.out.println(res.toString());
    }
}
