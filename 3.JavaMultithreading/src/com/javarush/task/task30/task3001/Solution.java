package com.javarush.task.task30.task3001;

import java.math.BigInteger;

/*
Конвертер систем счислений
*/
public class Solution {
    public static void main(String[] args) {

        BigInteger bigInt = new BigInteger("3", 10);
        System.out.println(new BigInteger("30", 10).toString(2));

//        Number number = new Number(NumerationSystemType._10, "6");
//        Number result = convertNumberToOtherNumerationSystem(number, NumerationSystemType._2);
//        System.out.println(result);    //expected 110
//
//        number = new Number(NumerationSystemType._16, "6df");
//        result = convertNumberToOtherNumerationSystem(number, NumerationSystemType._8);
//        System.out.println(result);    //expected 3337
//
//        number = new Number(NumerationSystemType._16, "abcdefabcdef");
//        result = convertNumberToOtherNumerationSystem(number, NumerationSystemType._16);
//        System.out.println(result);    //expected abcdefabcdef
    }

    public static Number convertNumberToOtherNumerationSystem(Number number, NumerationSystem expectedNumerationSystem) {
        //напишите тут ваш код
        BigInteger bi = new BigInteger(number.getDigit(), number.getNumerationSystem().getNumerationSystemIntValue());
        return new Number(expectedNumerationSystem, bi.toString(expectedNumerationSystem.getNumerationSystemIntValue()));
        //int inumber = Integer.parseInt(number.getDigit(), number.getNumerationSystem().getNumerationSystemIntValue());
        //return new Number(expectedNumerationSystem, Integer.toString(bi.intValue(), expectedNumerationSystem.getNumerationSystemIntValue()));
    }
}
