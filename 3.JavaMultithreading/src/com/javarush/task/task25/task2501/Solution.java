package com.javarush.task.task25.task2501;

/* 
Новые возможности!
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(Alphabet.G.getLetterPosition());
    }

    public enum Alphabet {



//        A(1), B(2), C(3), D(4), E(5),
//        F(6), G(7)
        A, B, C, D, E,
        F, G             , H, I, J,
        K, L, M, N, O,
        P, Q, R, S, T,
        U, V, W, X, Y, Z
        ;
//        private int letterPosition;
//        Alphabet(int i){letterPosition = i;}

        int getLetterPosition() {
            return ordinal()+1;
        }
    }
}
