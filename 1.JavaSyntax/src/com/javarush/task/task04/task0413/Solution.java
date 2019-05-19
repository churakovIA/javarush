package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String message;
        switch (n) {
            case 1: message = "понедельник"; break;
            case 2: message = "вторник"; break;
            case 3: message = "среда"; break;
            case 4: message = "четверг"; break;
            case 5: message = "пятница"; break;
            case 6: message = "суббота"; break;
            case 7: message = "воскресенье"; break;
            default: message = "такого дня недели не существует";
        }
        System.out.println(message);
    }
}