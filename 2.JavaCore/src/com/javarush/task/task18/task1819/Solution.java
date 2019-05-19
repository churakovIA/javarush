package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String[] fn = {in.nextLine(), in.nextLine()};

        FileInputStream fis1 = new FileInputStream(fn[0]);
        byte[] data1 = new byte[fis1.available()];
        fis1.read(data1);
        fis1.close();
        FileInputStream fis2 = new FileInputStream(fn[1]);
        byte[] data2 = new byte[fis2.available()];
        fis2.read(data2);
        fis2.close();

        FileOutputStream fos = new FileOutputStream(fn[0]);
        fos.write(data2);
        fos.flush();
        fos.write(data1);
        fos.close();
    }
}
