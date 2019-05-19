package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
//        Scanner in = new Scanner(System.in);
//        while (true) {
//            FileInputStream stream = new FileInputStream(in.nextLine());
//            int size = stream.available();
//            stream.close();
//            if(size < 1000) throw new DownloadException();
//        }
        StringBuilder sb = new StringBuilder();
        sb.append("Lena").append('\n');
        sb.append("Olya").append('\n');
        sb.append("Anya").append('\n');
        String data = sb.toString();

        //Оборачиваем строку в класс ByteArrayInputStream
        InputStream is = new ByteArrayInputStream("Lena\nOlya\n".getBytes());
        //подменяем in
        System.setIn(is);
        //проверяем
        Scanner in = new Scanner(System.in);
        System.out.println(in.nextLine());
        System.out.println(in.nextLine());
    }

    public static class DownloadException extends Exception {

    }
}
