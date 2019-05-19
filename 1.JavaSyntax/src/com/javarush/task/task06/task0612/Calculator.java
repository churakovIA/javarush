package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
        //напишите тут ваш код
        return a+b;
    }

    public static int minus(int a, int b) {
        //напишите тут ваш код
        return plus(a, -b);
    }

    public static int multiply(int a, int b) {
        //напишите тут ваш код
        return a*b;
    }

    public static double division(int a, int b) {
        return Double.valueOf(a)/Double.valueOf(b);
    }

    public static double percent(int a, int b) {
        return division(multiply(b, a), 100);
    }

    public static void main(String[] args) {
        int a=3,b=2;
        System.out.println(percent(a,b));
    }
}