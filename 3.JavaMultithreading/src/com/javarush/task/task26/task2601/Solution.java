package com.javarush.task.task26.task2601;

import java.util.Arrays;

/*
Почитать в инете про медиану выборки
*/
public class Solution {

    public static void main(String[] args) {
        //13, 8, 15, 5, 17
        //13, 15, 17, 8, 5
//        Integer[] a = new Integer[5];
//        a[0] = 13;
//        a[1] = 8;
//        a[2] = 15;
//        a[3] = 5;
//        a[4] = 17;
//        Integer[] sortArray = sort(a);
//        for (int i = 0; i < sortArray.length; i++) {
//            System.out.println(sortArray[i]);
//        }
    }

    public static Integer[] sort(Integer[] array) {
        //implement logic here

/*
        final double mediana = calcMediana(array);
        Comparator<Integer> c1 = (a, b) -> {
          return (int) ((1.0 * a) - mediana);
        };
        Arrays.sort(array, c1);
        return array;
*/
        int median;
        Arrays.sort(array);
        //Если массив с четным колличеством элементов
        if (array.length%2==0) median = (array[array.length/2] + array[array.length/2-1])/2;
            //И если с нечетным
        else median = array[array.length/2];

        //Сортируем по условию
        Arrays.sort(array,(x,y)->Integer.compare(Math.abs(median-x), Math.abs(median-y)));
        return array;
    }

    private static double calcMediana(Integer[] array) {
        int length = array.length;
//        if(length%2 == 0)
//            return (array[length / 2 - 1] + array[length / 2]) / 2.0;
//        else
//            return array[length / 2];
        if(length%2 == 0)
            return (array[array.length/2] + array[array.length/2-1])/2;
        else
            return array[length / 2];
//        if (array.length%2==0) median = (array[array.length/2] + array[array.length/2-1])/2;
//            //И если с нечетным
//        else median = array[array.length/2];
    }
}
