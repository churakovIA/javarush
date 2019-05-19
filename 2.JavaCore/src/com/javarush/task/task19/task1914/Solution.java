package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        System.setOut(consoleStream);

        String str = outputStream.toString();

        String[] m = str.split(" ");
        int a = Integer.parseInt(m[0]);
        int b = Integer.parseInt(m[2]);
        int c;
        switch (m[1]){
            case "+": c = a + b; break;
            case "-": c = a - b; break;
            default: c = a * b;
        }

        System.out.println(str + c);

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

