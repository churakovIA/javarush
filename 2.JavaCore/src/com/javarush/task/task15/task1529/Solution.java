package com.javarush.task.task15.task1529;

import java.util.Scanner;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        //add your code here - добавьте код тут
        reset();
    }

    public static Flyable result;

    public static void reset() {
        //add your code here - добавьте код тут
        Scanner in = new Scanner(System.in);
        String p = in.nextLine();
        switch (p) {
            case "helicopter" : result = new Helicopter(); break;
            case "plane" : result = new Plane(in.nextInt()); break;
        }
        in.close();
    }
}
