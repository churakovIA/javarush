package com.javarush.task.task21.task2103;

/* 
Все гениальное - просто!
*/
public class Solution {
    public static boolean calculate(boolean a, boolean b, boolean c, boolean d) {
//        return (a && b && c && !d) || (!a && c) || (!b && c) || (c && d);
        return c;
    }
//    public static boolean calculate1(boolean a, boolean b, boolean c, boolean d) {
////        return a && b && c && !d || !a && c || !b && c || c && d;
//        return c && (a && b && !d || !a || !b || d);
//    }

    public static void main(String[] args) {
//        System.out.println(calculate(true,false,true,false));
//        System.out.println(calculate1(true,false,true,false));
    }
}
