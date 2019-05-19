package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут
        Person current;
        //System.out.println(Arrays.asList(args));
        SimpleDateFormat pattern = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        if(args.length == 0) return;
        switch (args[0]){
            case "-c":
                current = args[2] == "м" ? Person.createMale(args[1], pattern.parse(args[3])) :
                                            Person.createFemale(args[1], pattern.parse(args[3]));
                allPeople.add(current);
                System.out.println(allPeople.indexOf(current));
                break;
            case "-u":
                current = allPeople.get(Integer.parseInt(args[1]));
                current.setName(args[2]);
                current.setSex(args[3] == "м" ? Sex.MALE : Sex.FEMALE);
                current.setBirthDay(pattern.parse(args[4]));
                break;
            case "-d":
                current = allPeople.get(Integer.parseInt(args[1]));
                current.setBirthDay(null);
                current.setName(null);
                current.setSex(null);
                break;
            case "-i":
                SimpleDateFormat f = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                current = allPeople.get(Integer.parseInt(args[1]));
                String info = String.format("%s %s %s",
                        current.getName(),
                        current.getSex() == Sex.MALE ? "м" : "ж",
                        f.format(current.getBirthDay()));
                System.out.println(info);
                break;
        }
    }
}
