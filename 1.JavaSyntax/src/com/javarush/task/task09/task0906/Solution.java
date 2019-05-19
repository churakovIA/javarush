package com.javarush.task.task09.task0906;

/* 
Логирование стек трейса
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        //напишите тут ваш код
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[2];
        System.out.println( String.format("%s: %s: %s", stackTraceElement.getClassName(),stackTraceElement.getMethodName(), s) );
    }
}
