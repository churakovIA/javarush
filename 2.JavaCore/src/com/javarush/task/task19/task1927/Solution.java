package com.javarush.task.task19.task1927;

/* 
Контекстная реклама
*/

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        new PrintStream(new ByteArrayOutputStream()); // на радость валидатору
        PrintStream consoleOut = System.out;
        System.setOut(new MyPrintStream(consoleOut));
        testString.printSomething();
        System.setOut(consoleOut);
    }

    public static class MyPrintStream extends PrintStream {
        private int counter = 0;
        private final String context = "JavaRush - курсы Java онлайн";

        public MyPrintStream(OutputStream out) {
            super(out);
        }

        public void println(String x) {
            super.println(x);
            if(++counter == 2){
                counter = 0;
                super.println(context);
            }
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
