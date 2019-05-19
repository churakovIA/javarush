package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String f1 = br.readLine();
        String f2 = br.readLine();
        br.close();

        try(
                BufferedReader brf1 = new BufferedReader(new FileReader(f1));
                BufferedReader brf2 = new BufferedReader(new FileReader(f2));
        ){
            String s1 = null;
            String s2 = null;
            boolean needread = true;
            while (true){
                brf1.mark(128);
                brf2.mark(128);
                s1 = brf1.readLine();
                if(needread){
                    s2 = brf2.readLine();
                } else needread = true;

                if (s1 == null & s2 == null){
                    break;
                } else if(s1 == null){
                    lines.add(new LineItem(Type.ADDED, s2));
                } else if(s2 == null){
                    lines.add(new LineItem(Type.REMOVED, s1));
                } else if(s1.equals(s2)){
                    lines.add(new LineItem(Type.SAME, s1));
                } else{
                    String olds2 = s2;
                    s2 = brf2.readLine();

                    if(s1.equals(s2)){
                        lines.add(new LineItem(Type.ADDED, olds2));
                        brf1.reset();
                        needread = false;
                    } else {
                        lines.add(new LineItem(Type.REMOVED, s1));
                        brf2.reset();
                    }
                }
            }
        }
    }

    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
