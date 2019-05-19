package com.javarush.task.task05.task0529;

import java.util.Scanner;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner r = new Scanner(System.in);
        int sum=0;
        for (int i=0;!r.hasNext("сумма");sum+=i) i=r.nextInt();
        System.out.println(sum);
        /*
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        IntSummaryStatistics stats = new IntSummaryStatistics();
        String a = "";
        do {
            a = in.readLine();
            System.out.println(Integer.parseInt(a));


        } while (! a.equals("сумма"));
*/
    }
}
