package com.javarush.task.task04.task0443;


/* 
Как назвали, так назвали
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        int y = in.nextInt();
        int m = in.nextInt();
        int d = in.nextInt();
        System.out.println(String.format("Меня зовут %s.", name));
        System.out.println(String.format("Я родился %s.%s.%s", d,m,y));
    }
}
