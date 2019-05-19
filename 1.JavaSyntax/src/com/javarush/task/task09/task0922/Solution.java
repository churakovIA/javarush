package com.javarush.task.task09.task0922;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner in = new Scanner(System.in);
        Date date = new Date(in.nextLine());
//        Date date = new Date("08/18/2013");

        SimpleDateFormat format = new SimpleDateFormat("MMM dd, yyyy"); //AUG 18, 2013
        System.out.println(format.format(date).toUpperCase());
    }
}
