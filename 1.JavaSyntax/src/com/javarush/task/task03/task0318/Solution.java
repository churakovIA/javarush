package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {

        //Scanner in = new Scanner(System.in);
        //String name = in.next();
        //int y = in.nextInt();
        //BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader in = new BufferedReader(new FileReader("E:\\ibases.v8i"));
        ArrayList<String> array = new ArrayList<>();
        String s = in.readLine();
        while (s != null && !"exit".equals(s)) {
            array.add(s);
            s = in.readLine();
        }
        System.out.println(array);
//        System.out.println(String.join("", array));
        //String name = in.readLine();
        //String y = in.readLine();
        //System.out.printf("%s захватит мир через %s лет. Му-ха-ха!", name, y);
    }
}
