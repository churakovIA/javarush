package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Solution {
    public static void main(String[] args) throws IOException {
        //String fname1 = "E:\\trash\\java\\source.txt";
        String fname1 = args[0];
        int count = 0;
        int countAll = 0;
        FileInputStream fileInputStream = new FileInputStream(fname1);
        while (fileInputStream.available()>0)
        {
            int code = fileInputStream.read();
            if(code==32)
                count++;
            countAll++;
        }
        fileInputStream.close();

        BigDecimal bd = new BigDecimal((count*1.0)/(countAll*1.0)*100);

        System.out.println(bd.setScale(2, RoundingMode.HALF_UP));


    }
}
