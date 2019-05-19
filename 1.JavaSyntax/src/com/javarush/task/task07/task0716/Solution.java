package com.javarush.task.task07.task0716;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); //0
        list.add("лоза"); //1
        list.add("лира"); //2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {

        int count = list.size();
        for (int i = count-1; i >= 0; i--) {
            String nextStr = list.get(i);
            boolean conteins1 = nextStr.contains("р");
            boolean conteins2 = nextStr.contains("л");
            if(conteins1 && !conteins2) list.remove(i);
            if(!conteins1 && conteins2) list.add(nextStr);
        }

        return list;
    }
}