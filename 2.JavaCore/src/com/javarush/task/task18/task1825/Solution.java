package com.javarush.task.task18.task1825;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeMap;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        TreeMap<Integer, String> map = new TreeMap<>();
        String[] tokens = new String[2];

        Scanner in = new Scanner(System.in);
        String fName;
        while (!(fName = in.nextLine()).contains("end"))
        {
            tokens = fName.split(".part");
            map.put(Integer.parseInt(tokens[1]), fName);
        }

        FileOutputStream fos = new FileOutputStream((tokens[0]));
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        map.forEach((k,v) ->
                {
                    try (FileInputStream fis = new FileInputStream(v);) {
                        byte[] data = new byte[fis.available()];//Files.readAllBytes(Paths.get(v));
                        fis.read(data);
                        bos.write( data );
                        fis.close();
                    } catch (IOException e) {

                    }
                }
        );

        in.close();
        bos.close();
        fos.close();

    }
}
