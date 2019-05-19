package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<10;i++) {
            String nextStr = in.readLine();
            list.add(nextStr);
            if(nextStr.length() < min) min = nextStr.length();
            if(nextStr.length() > max) max = nextStr.length();
        }
        boolean firstMin = true;
        boolean find = false;

        for(String nextStr: list) {
            if(nextStr.length() == min && !find){
                find = true;
                firstMin = true;
            }
            else if(nextStr.length() == max && !find){
                find = true;
                firstMin = false;
            }

            if(find && nextStr.length() == (firstMin?min:max) ){
                System.out.println(nextStr);
                break;
            }

        }

    }
}
