package com.javarush.task.task15.task1516;

/* 
Значения по умолчанию
*/

import java.lang.reflect.Field;

public class Solution {
    int intVar;
     double doubleVar;
     Double DoubleVar = 0d;
     boolean booleanVar;
     Object ObjectVar = new Object();
     Exception ExceptionVar = new Exception();
     String StringVar = "";

    public static void main(String[] args) throws Exception{
        Solution solution = new Solution();
        for(Field f : Solution.class.getDeclaredFields())
            System.out.println(f.get(solution));
        System.out.println(solution.intVar);
        System.out.println(solution.doubleVar);
        System.out.println(solution.DoubleVar);
        System.out.println(solution.booleanVar);
        System.out.println(solution.ObjectVar);
        System.out.println(solution.ExceptionVar);
        System.out.println(solution.StringVar);
    }
}
