package com.javarush.task.task34.task3403;

/* 
Разложение на множители с помощью рекурсии
*/
public class Solution {
    public void recursion(int n) {
        if(n <= 1) return;
        int divider = 2;
        while (n % divider != 0){
            divider++;
        }
        System.out.print(divider + " ");
        if(divider<n)
            recursion(n/divider);
    }

    public static void main(String[] args) {
        new Solution().recursion(132);
    }
}
