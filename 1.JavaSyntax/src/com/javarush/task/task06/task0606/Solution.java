package com.javarush.task.task06.task0606;

import java.io.IOException;
import java.util.Scanner;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        while (a != 0) {
            int nextInt = a % 10;
            a /= 10;

            if(nextInt % 2 == 0) even++;
            else odd++;
        }
        System.out.println(String.format("Even: %d Odd: %d", even, odd));
    }
}
