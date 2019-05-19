package com.javarush.task.task30.task3010;

/* 
Минимальное допустимое основание системы счисления
*/

import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        try {
            String str;
            str = args[0];
            int i;
            for(i = 36; i>1; i--){
                try {
                    new BigInteger(str, i);
                } catch (Exception e) {
                    break;
                }
            }
            System.out.println(++i == 37 ? "incorrect" : i);
        } catch (Exception e) {

        }
    }
}