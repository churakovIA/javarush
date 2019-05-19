package com.javarush.task.task18.task1823;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fName;
        while (!(fName = in.nextLine()).equals("exit"))
        {
            new ReadThread(fName).start();
        }
        in.close();
    }

    public static class ReadThread extends Thread {
        private String fileName;

        public ReadThread(String fileName) {
            //implement constructor body
            this.fileName = fileName;
        }
        // implement file reading here - реализуйте чтение из файла тут

        @Override
        public void run() {
            try {

                HashMap<Integer, Integer> map = new HashMap<>();
                int maxCount = 0;
                int maxByte = 0;

                FileInputStream fis = new FileInputStream(fileName);
                while (fis.available() > 0)
                {
                    int data = fis.read();
                    int v = map.merge(data, 1, Integer::sum);
                    if(maxCount < v)
                    {
                        maxCount = v;
                        maxByte = data;
                    }
                }
                resultMap.put(fileName, maxByte);

                fis.close();

            } catch (IOException e) {
            }
        }
    }
}
