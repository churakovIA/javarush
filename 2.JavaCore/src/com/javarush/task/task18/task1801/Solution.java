package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String fname = in.readLine();

        int maxByte = 0;

        FileInputStream stream = new FileInputStream(fname);
        while (stream.available() > 0){
            int data = stream.read();
            if (data > maxByte) maxByte = data;
        }

        stream.close();
        in.close();

        System.out.println(maxByte);

    }
}
