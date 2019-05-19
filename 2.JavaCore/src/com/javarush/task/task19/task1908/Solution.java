package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String f1 = br.readLine();
        String f2 = br.readLine();
        br.close();

        BufferedReader in = new BufferedReader(new FileReader(f1));
        BufferedWriter out = new BufferedWriter(new FileWriter(f2));

            String str;
            while ((str = in.readLine()) != null){
                for(String num : str.split(" "))
                    if(!num.isEmpty()){
                        try {
                            Long l = Long.parseLong(num);
                            out.write(l+" ");
                        } catch (NumberFormatException e) {

                        }
                    }

            }

        in.close();
        out.close();

/*
//            String str;
//            while ((str = in.readLine()) != null){
////                out.write(str.replaceAll("\\D+", " "));
//                for(String num : str.split("\\D+"))
//                    if(!num.isEmpty())
//                        out.write(num+" ");
//                    //System.out.println("("+num+")");
//                //Character.isDigit()
//            }
            int data;
            boolean f = false;
//            while ((data = in.read()) != -1){
            while (in.ready()){
                data = in.read();
                if (Character.isDigit(data)){
                    f = true;
                    //System.out.print((char) data);
                    out.write(data);
                } else if(f){
                    f = false;
                    //System.out.print(" ");
                    out.write(" ");
                }

            }
*/

//            //-вариант 1-----------
//            String str;
//            while ((str = in.readLine()) != null){
//                for(String num : str.split("\\D+"))
//                    if(!num.isEmpty())
//                        out.write(num+" ");
//            }
//            //-----------

//            //-вариант 2----------
//            int data;
//            boolean f = false;
//            while (in.ready()){
//                data = in.read();
//                if (Character.isDigit(data)){
//                    f = true;
//                    out.write(data);
//                } else if(f){
//                    f = false;
//                    out.write(" ");
//                }
//            }
//            //-----------

//            //-вариант 3----------
//            Pattern pattern = Pattern.compile("\\D+");
//            String str;
//            while ((str = in.readLine()) != null){
//                Matcher matcher = pattern.matcher(str);
//                out.write(matcher.replaceAll(" ").trim() + " ");
//            }
//            //-----------
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
