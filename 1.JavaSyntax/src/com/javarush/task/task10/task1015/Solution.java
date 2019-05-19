package com.javarush.task.task10.task1015;

import java.util.ArrayList;
import java.util.Collections;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String>[] arrayLists = new ArrayList[2];

        ArrayList<String> arrayList1 = new ArrayList<>();
        Collections.addAll(arrayList1, "мама","мыла","раму");
        ArrayList<String> arrayList2 = new ArrayList<>();
        Collections.addAll(arrayList2, "abcd","ab","abc","ccccd");

        arrayLists[0] = arrayList1;
        arrayLists[1] = arrayList2;

        return arrayLists;

        //return null;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}