package com.javarush.task.task26.task2603;

import java.util.Comparator;

/*
Убежденному убеждать других не трудно
*/
public class Solution {

    public static void main(String[] args) {

    }

    public static class CustomizedComparator<T> implements Comparator<T> {

        private Comparator<T>[] comparators;

        public CustomizedComparator(Comparator<T> comparator, Comparator<T>...vararg) {
            this.comparators = new Comparator[vararg.length + 1];
            comparators[0] = comparator;
            for (int i = 1; i < comparators.length; i++) {
                comparators[i] = vararg[i-1];
            }
        }

        public CustomizedComparator(Comparator<T>...vararg) {
            this.comparators = vararg;
        }

        @Override
        public int compare(T o1, T o2) {
            int res = 0;
            for(Comparator<T> comparator : comparators){
                res = comparator.compare(o1, o2);
                if(res!=0) break;
                //res +=  t < 0 ? -1 : t>0 ? 1 : 0;
            }
            return res;
        }
    }

}
