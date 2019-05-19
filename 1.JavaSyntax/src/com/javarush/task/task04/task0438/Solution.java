package com.javarush.task.task04.task0438;

/* 
Рисуем линии
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String gor = "";
        String ver = "";
        for(int i = 0;i<10;i++) {
            gor = gor.concat("8");
            ver = ver.concat("8\n");
        }
        System.out.println(gor + '\n' + ver);
    }
}
