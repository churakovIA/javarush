package com.javarush.task.task15.task1527;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws MalformedURLException {
        //add your code here
        Scanner in = new Scanner(System.in);
        String[] array = new URL(in.nextLine()).getQuery().split("\\&");
        System.out.println( Stream.of(array).map(s->s.replaceAll("=.*$","")).collect(Collectors.joining(" ")) );
        Stream.of(array).filter(s->s.startsWith("obj=")).map(s->s.replace("obj=", ""))
                .forEach(s->{
                    try {
                        alert(Double.parseDouble(s));
                    } catch (NumberFormatException e) {
                        alert(s);
                    }
                });
        in.close();
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
