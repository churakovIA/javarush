package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int sum = 0;
        while (number!=0) {
            int ost = number%10;
            sum += ost;
            number = (number-ost)/10;
            //number /= 10;
        }
        return sum;
    }
}