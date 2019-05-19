package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String fileName = in.readLine();
        FileInputStream inputStream = new FileInputStream(fileName);
        while (inputStream.available() > 0) {
            System.out.write(inputStream.read());
        }
        inputStream.close();
        in.close();
    }
}