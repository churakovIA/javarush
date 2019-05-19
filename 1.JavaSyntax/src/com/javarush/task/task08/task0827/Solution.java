package com.javarush.task.task08.task0827;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
        //System.out.println(isDateOdd("JANUARY 2 2000"));
    }

    public static boolean isDateOdd(String date) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(new Date(date));
        return calendar.get(Calendar.DAY_OF_YEAR) % 2 != 0;
    }
}
