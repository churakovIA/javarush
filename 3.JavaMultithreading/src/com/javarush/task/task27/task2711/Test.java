package com.javarush.task.task27.task2711;

import java.io.IOException;

public class Test
{
    public static void main(String[] args) throws IOException {
        //String num = "501234567";
        //System.out.printf("%s\n", num.substring(0, 2));
        final int code = 38;
        final int num = 501234567;

        System.out.printf("+%d(%03d)%d-%d-%d\n", code, num/10000000, (num%10000000-num%10000)/10000, (num%10000-num%100)/100, num%100);

        String snum = String.format("%010d", num);

        System.out.printf("+%d(%s)%s-%s-%s\n", code, snum.substring(0, 3), snum.substring(3, 6), snum.substring(6, 8), snum.substring(8, 10));

        /*String fName = "E:\\trash\\17033012.log";
        String findStr = "computerName=RUHLOVSA";

        Stream<String> stream = Files.lines(Paths.get(fName));
        stream.filter(s -> s.contains(findStr)).forEach(System.out::println);*/

    }
}
