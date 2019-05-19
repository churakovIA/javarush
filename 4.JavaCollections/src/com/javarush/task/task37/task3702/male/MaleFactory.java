package com.javarush.task.task37.task3702.male;

import com.javarush.task.task37.task3702.AbstractFactory;
import com.javarush.task.task37.task3702.Human;
import com.javarush.task.task37.task3702.female.KidGirl;
import com.javarush.task.task37.task3702.female.Woman;

public class MaleFactory implements AbstractFactory {

    public Human getPerson(int age){
        if(age<= KidGirl.MAX_AGE) return new KidGirl();
        else if(age<= TeenBoy.MAX_AGE) return new TeenBoy();
        else return new Woman();
    }

}
