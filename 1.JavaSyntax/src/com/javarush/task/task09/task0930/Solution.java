package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/*
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
//        while (true) {
//            String s = reader.readLine();
//            if (s.isEmpty()) break;
//            list.add(s);
//        }
//
//        String[] array = list.toArray(new String[list.size()]);
        String[] array = {"Вишня","1","Боб","3","Яблоко","22","0","Арбуз"};
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        //напишите тут ваш код

        //Arrays.sort(array);
        //Arrays.sort(array, new MyComparator());

        Comparator<String> comparator1 = (f, s) -> {
            if(isNumber(f) && !isNumber(s)) return 1;
            else if(!isNumber(f) && isNumber(s)) return -1;
            else return 0;
        };

        Comparator<String> comparator2 = (f, s) -> {
            return isNumber(f) && isNumber(s) ? Integer.compare( Integer.parseInt(s), Integer.parseInt(f) )
                    : isGreaterThan(f, s) ? 1 : -1;
        };

        Arrays.sort(array, comparator1.thenComparing(comparator2));

    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-')) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }

    static class MyComparator implements Comparator<String> {
        public int compare(String f, String s) {
            System.out.println(String.format("f:%s;s:%s", f, s));
            return isNumber(f) && isNumber(s) ? Integer.parseInt(s) - Integer.parseInt(f)
                    : !isNumber(f) && !isNumber(s) ? isGreaterThan(f, s) ? 1 : -1
                            : 0;
                        //: isNumber(f) != isNumber(s) ? -1 : 0;
//            int resault = 0;
//            if(isNumber(f) && isNumber(s))
//                //resault = Integer.compare(Integer.parseInt(f), Integer.parseInt(s));
//                resault = Integer.parseInt(s) - Integer.parseInt(f);
//            else if(!isNumber(f) && !isNumber(s))
//                resault = isGreaterThan(f, s) ? 1 : -1;
//
//            return resault;
//                return Integer.compare(f.length(), s.length());
        }
    }

}
