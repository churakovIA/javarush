package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        String fname1 = "E:\\trash\\java\\source.txt";
//        String fname2 = "E:\\trash\\java\\destination1.txt";
//        String fname3 = "E:\\trash\\java\\destination2.txt";
        String fname1 = in.readLine();
        String fname2 = in.readLine();
        String fname3 = in.readLine();

        FileOutputStream stream1 = new FileOutputStream(fname1);

        FileInputStream stream2 = new FileInputStream(fname2);
        byte[] data2 = new byte[stream2.available()];
        stream2.read(data2);
        stream2.close();

        FileInputStream stream3 = new FileInputStream(fname3);
        byte[] data3 = new byte[stream3.available()];
        stream3.read(data3);
        stream3.close();

        stream1.write(data2);
        stream1.flush();
        stream1.write(data3);
        stream1.close();


    }
}
