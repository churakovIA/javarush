package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String gfName = reader.readLine();
        Cat catGF = new Cat(gfName);

        String gmName = reader.readLine();
        Cat catGM = new Cat(gmName);

        String fName = reader.readLine();
        Cat catF = new Cat(fName,null,catGF);

        String mName = reader.readLine();
        Cat catM = new Cat(mName, catGM,null);

        String sName = reader.readLine();
        Cat catS = new Cat(sName, catM, catF);

        String dName = reader.readLine();
        Cat catD = new Cat(dName, catM, catF);

        System.out.println(catGF);
        System.out.println(catGM);
        System.out.println(catF);
        System.out.println(catM);
        System.out.println(catS);
        System.out.println(catD);
    }

    public static class Cat {
        private String name;
        private Cat parent;
        private Cat fparent;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parent, Cat fparent) {
            this.name = name;
            this.parent = parent;
            this.fparent = fparent;
        }

        @Override
        public String toString() {
            if (parent == null && fparent == null)
                return "Cat name is " + name + ", no mother, no father";
            else if (parent == null)
                return "Cat name is " + name + ", no mother, father is " + fparent.name;
            else if (fparent == null)
                return "Cat name is " + name + ", mother is " + parent.name + ", no father";
            else
                return "Cat name is " + name + ", mother is " + parent.name + ", father is " + fparent.name;
        }
    }

}
