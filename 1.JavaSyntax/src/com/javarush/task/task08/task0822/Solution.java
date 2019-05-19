package com.javarush.task.task08.task0822;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        // find minimum here — найти минимум тут

        return Collections.min(array);
    }

    public static List<Integer> getIntegerList() throws IOException {
        //create and initialize a list here - создать и заполнить список тут
        Scanner in = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        int a = in.nextInt();
        for(int i = 0; i < a; i++) list.add(in.nextInt());

        return list;
    }
}
