package com.javarush.task.task08.task0826;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Пять победителей
*/

public class Solution {
    public static void main(String[] args) throws Exception {
/*
        String[] a = {"Самара", "Орел", "Астрахань", "Брянск", "Мурманск", "Москва"};
        Arrays.sort(a, new TestComparator());
        System.out.println(Arrays.asList(a));
*/

//        int[] array = {2,4,8,5,6,1,0,9,3,11};
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array) {
        //напишите тут ваш код
        Arrays.sort(array);
        for(int i = 0; i < array.length/2; i++){
            int reverseId = array.length-i-1;
            int temp = array[i];
            array[i] = array[reverseId];
            array[reverseId] = temp;
        }
/*
        int[] copy = Arrays.copyOf(array, array.length);
        for(int i = array.length - 1; i!=0; i--) array[i] = copy[array.length - i];
        //Arrays.sort(array, Comparator.reverseOrder());
        //ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        //list.
        //theIntStream.boxed().collect(Collectors.toList())
//        Collections.reverse(array);
*/
    }


}

/*
class TestComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
//        System.out.println(o1 + " - " + o2 + " " + o1.compareTo(o2));
        String first = "Самара";

        if(first.equals(o1)) return -1;
        else if(first.equals(o2)) return 1;
        else return o1.compareTo(o2);
*/
/*
        else if(o1.compareTo(o2) < 0) return  -1;
        else if(o1.compareTo(o2) > 0) return  1;
        else return 0;
*//*

//        return "Орел".equals(o1) || "Орел".equals(o2) ? Integer.MIN_VALUE : o1.compareTo(o2);//o2.length() - o1.length();
    }
}
*/
