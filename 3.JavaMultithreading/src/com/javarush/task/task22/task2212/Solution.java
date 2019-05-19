package com.javarush.task.task22.task2212;

/* 
Проверка номера телефона
*/
public class Solution {
    public static boolean checkTelNumber(String telNumber) {
        if(telNumber == null) return false;
        return telNumber.matches("\\+?(\\d{2}\\(\\d{3}\\)|\\d{5})?(\\d{3}|\\d{6})-?\\d{2}-?\\d{2}");
    }

    public static void main(String[] args) {
        printCheck("+380501234567");
        printCheck("+38(050)1234567");
        printCheck("+38050123-45-67");
        printCheck("050123-4567");
        printCheck("+38)050(1234567");
        printCheck("+38(050)1-23-45-6-7");
        printCheck("050ххх4567");
        printCheck("050123456");
        printCheck("(0)501234567");
    }

    private static void printCheck(String s) {
        System.out.printf("%s - %b%n", s, checkTelNumber(s));
    }
}

//    "^( \(\d{3}\) | ^\d{3}[.-]?)? \d{3}[.-]?\d{4}$"
