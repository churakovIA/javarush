package com.javarush.task.task22.task2207;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/* 
Обращенные слова
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        String filename = "E:\\trash\\java\\source.txt";

        try (Scanner sc = new Scanner(System.in)){
            filename = sc.nextLine();
        } catch (Exception e) {
            throw e;
        }

        String content = new String (Files.readAllBytes(Paths.get(filename)));

        StringTokenizer stringTokenizer = new StringTokenizer(content);

        String[] m = new String[stringTokenizer.countTokens()];

        for(int i = 0; i < m.length; i++)
            m[i] = stringTokenizer.nextToken();

        Set<String> set = new HashSet<>();

        for(int i = 0; i < m.length; i++){

            for(int j = 0; j < m.length; j++){
                if(i!=j && m[i].equals(new StringBuilder(m[j]).reverse().toString())){
                    Pair pair = new Pair(m[i], m[j]);
                    if(!set.contains(pair.toString())) {
                        result.add(pair);
                        set.add(pair.toString());
                    }
//                    if(!result.contains(pair)) result.add(pair);
/*
                    if(!set.contains(pair.hashCode())) {
                        result.add(pair);
                        set.add(pair.hashCode());
                    }
*/
                }

            }
        }

        result.forEach(System.out::println);

    }

    public static class Pair {
        String first;
        String second;

        public Pair() {
        }

        public Pair(String first, String second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                    first == null && second != null ? second :
                    second == null && first != null ? first :
                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
