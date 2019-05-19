package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String fname = in.readLine();
        int count = 0;
        FileInputStream stream = new FileInputStream(fname);
        while (stream.available()>0)
            if(stream.read() == (int)',') count++;
        System.out.println(count);
        stream.close();
        in.close();

    }
}
