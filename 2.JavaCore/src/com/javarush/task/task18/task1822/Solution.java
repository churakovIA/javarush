package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        String id = args[0];
        Scanner in = new Scanner(System.in);
        FileInputStream fis = new FileInputStream(in.nextLine());
        in.close();
        byte[] data = new byte[fis.available()];
        fis.read(data);
        fis.close();

        String context = new String(data);

        Arrays.asList(context.split(System.getProperty("line.separator"))).stream()
                                                .filter(s -> s.startsWith(id + " "))
                                                .forEach(System.out::println);
    }
}
