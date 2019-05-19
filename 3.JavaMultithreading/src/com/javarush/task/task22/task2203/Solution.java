package com.javarush.task.task22.task2203;

/*
Между табуляциями
*/
public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {
        String res = "";
        try {
            String substr = string.substring(string.indexOf('\t')+1);
            res = substr.substring(0, substr.indexOf('\t'));
        } catch (Exception e) {
            throw new TooShortStringException();
        }
        return res;
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
    }
}
