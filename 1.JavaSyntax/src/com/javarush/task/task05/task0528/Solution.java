package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/

import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        System.out.println(String.format("%1$td %1$tm %1$tY",new Date()));
    }
}