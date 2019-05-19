package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/
public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(getPartOfString("JavaRush - лучший"));
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) {

        if(string == null) throw new TooShortStringException();

        String res = "";
        String[] m = string.split(" ");
        try {
            res = String.format("%s %s %s %s", m[1], m[2], m[3], m[4]);
        }catch (ArrayIndexOutOfBoundsException e){
            throw new TooShortStringException();
        }
        catch (Exception e) {

        }
        return res;
    }

    public static class TooShortStringException extends RuntimeException {
    }
}
