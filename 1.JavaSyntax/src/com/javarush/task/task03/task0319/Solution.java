package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] a = new String[3];
        for(int i=0;i<a.length;i++) a[i] = in.readLine();
        //System.out.println(a[0] + " получает " + «число1» через «число2» лет.);
        System.out.println(String.join(" ", a[0],"получает",a[1],"через",a[2],"лет."));
    }
}
