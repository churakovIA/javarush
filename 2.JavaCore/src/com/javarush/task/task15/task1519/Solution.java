package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
/*
        Scanner in = new Scanner(System.in);
        String str;
        while (true) {

            if(in.hasNextDouble()) {
                double d = in.nextDouble();
                if(str.contains(".")) print(i);
            }
*/

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while (!(str = in.readLine()).equals("exit")) {
            if(str.contains(".")) {
                try {
                    print(Double.parseDouble(str));
                } catch (NumberFormatException e) {
                    print(str);
                }
            }
            else {
                try {
                    Integer i = Integer.parseInt(str);
                    if(i > 0 && i < 128) print(Short.valueOf(str));
                    else if(i <= 0 || i >= 128) print(Integer.parseInt(str));
                } catch (NumberFormatException e) {
                    print(str);
                }
            }

/*
            try {
                double i = Double.parseDouble(str);
                if(str.contains(".")) print(i);
            } catch (NumberFormatException e) {

                try {
                    Integer i = Integer.parseInt(str);
                    if(i > 0 && i < 128) print(Short.valueOf(str));
                    else if(i <= 0 && i >= 128) print(Integer.parseInt(str));
                } catch (NumberFormatException e1) {
                    print(str);
                }

            }
*/

////            if(str.indexOf('.') >= 0) print(i);
////                else if(i > 0 && i < 128) print((short) i);
////                else if(i <= 0 && i >= 128) print(Integer.parseInt(str));
////                //else print(str);
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
