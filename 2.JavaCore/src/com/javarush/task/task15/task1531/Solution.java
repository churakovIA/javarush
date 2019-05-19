package com.javarush.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.stream.IntStream;

/* 
Факториал
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        //int input = 4;
        reader.close();

        System.out.println(factorial(input));
//    for(int i = -1; i <= 4; i++)
//        System.out.printf("%s : %s\n", i, factorial(i));
    }


    public static String factorial(int n) {
        return String.valueOf(n < 0 ? 0 : IntStream.rangeClosed(1, n)       // получаем поток значений int от 1 до n включительно
                                            .mapToObj(BigInteger::valueOf)  // приводим значения int в потоке к типу BigInteger
                                            .reduce(BigInteger.ONE, BigInteger::multiply)); // сводим поток к одному значению BigInteger путем перемножения (multiply)
    }
}
