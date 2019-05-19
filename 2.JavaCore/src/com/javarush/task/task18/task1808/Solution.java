package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        //System.out.println(5/2);

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        String fname1 = "E:\\trash\\java\\source.txt";
//        String fname2 = "E:\\trash\\java\\destination1.txt";
//        String fname3 = "E:\\trash\\java\\destination2.txt";
        String fname1 = in.readLine();
        String fname2 = in.readLine();
        String fname3 = in.readLine();

        FileInputStream inputStream = new FileInputStream(fname1);
        FileOutputStream outputStream1 = new FileOutputStream(fname2);
        FileOutputStream outputStream2 = new FileOutputStream(fname3);

        /*/+
        byte[] buffer = new byte[inputStream.available()];
        inputStream.read(buffer);
        for(byte b : buffer) System.out.print(b + " ");
        System.out.println();
        for(byte b : Arrays.copyOfRange(buffer, 0, buffer.length/2)) System.out.print(b + " ");
        System.out.println();
        for(byte b : Arrays.copyOfRange(buffer, buffer.length/2, buffer.length)) System.out.print(b + " ");

        //Arrays.asList().forEach(System.out::println);
        //System.out.println(Arrays.asList(buffer));
        //ArrayList<Integer> list = new ArrayList<>();
        //list.addAll();
        //System.out.println(list);
        */

        if (inputStream.available() > 0) {
            byte[] buffer = new byte[inputStream.available()];

            int count = inputStream.read(buffer);

//            outputStream1.write(Arrays.copyOfRange(buffer, 0, count/2));
//            outputStream2.write(Arrays.copyOfRange(buffer, count/2, count));
            outputStream1.write(buffer, 0, count - count / 2);
            outputStream2.write(buffer, count - count / 2, count - (count - count / 2));
        }

        inputStream.close();
        outputStream1.close();
        outputStream2.close();

    }
}
