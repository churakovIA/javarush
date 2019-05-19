package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
//        FileInputStream fis = new FileInputStream("E:\\trash\\java\\source.txt");
//        FileOutputStream fos = new FileOutputStream("E:\\trash\\java\\destination.txt");
        FileInputStream fis = new FileInputStream(in.nextLine());
        FileOutputStream fos = new FileOutputStream(in.nextLine());
        in.close();

        StringBuilder stringBuilder = new StringBuilder();
        while (fis.available()>0) stringBuilder.append(Character.valueOf((char) fis.read()));

        for(String s : stringBuilder.toString().split("[ ]") )
        {
            int i = (int) Math.round(Double.parseDouble(s));
            for(char ch : String.valueOf(i).toCharArray())
            {
                fos.write(ch);
            }
            fos.write(' ');
        }

        fis.close();
        fos.close();

    }
}


//            int i = (int) Math.round(inDouble.nextDouble());
