package com.javarush.task.task14.task1408;

public class RussianHen extends Hen {

    public int getCountOfEggsPerMonth() {
        return 100500;
    }
    public String getDescription(){
        return super.getDescription() + String.format(" Моя страна - %s. Я несу %s яиц в месяц.", Country.RUSSIA, getCountOfEggsPerMonth());
    }
}
