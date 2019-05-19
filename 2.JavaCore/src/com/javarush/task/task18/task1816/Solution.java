package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        //String fname1 = "E:\\trash\\java\\source.txt";
        String fname1 = args[0];
        int count = 0;
        FileInputStream fileInputStream = new FileInputStream(fname1);
        while (fileInputStream.available()>0)
        {
            int code = fileInputStream.read();
            if(code>=65&& code<=90 || code>=97&& code<=122)
                count++;
        }
        System.out.println(count);
        fileInputStream.close();
    }
}
