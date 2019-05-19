package com.javarush.task.task21.task2113;

import java.util.Arrays;
import java.util.List;

public class MyTestString {
    public static void main(String[] args) {
/*
        String s = "Мамамыла.папу";
        System.out.println(s.charAt(2));
        System.out.println(s.codePointAt(2));

        //IntStream codePoints()
        System.out.println(s.codePoints().filter(Character::isAlphabetic).count() == s.length() );
*/

        String s = "Мама мыла папу!";
        int[] m = s.codePoints().filter(Character::isAlphabetic).toArray();
        String trueString = new String( m, 0, m.length );
        System.out.println( trueString ); // Мамамылапапу



//        List<String> data = new ArrayList<>();
//        data.add("клубника");
//        data.add("150");
//        data.add("20");

        List<String> data = Arrays.asList("клубника","150","20","только по предоплате");
        trueString = String.join(";", data);
        System.out.println(trueString);

    }
}
