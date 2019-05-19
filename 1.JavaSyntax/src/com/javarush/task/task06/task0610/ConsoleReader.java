package com.javarush.task.task06.task0610;

import java.util.Scanner;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public static int readInt() throws Exception {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static double readDouble() throws Exception {
        Scanner in = new Scanner(System.in);
        return in.nextDouble();
    }

    public static boolean readBoolean() throws Exception {
        Scanner in = new Scanner(System.in);
        return in.nextBoolean();
    }

    public static void main(String[] args) {

    }
}
