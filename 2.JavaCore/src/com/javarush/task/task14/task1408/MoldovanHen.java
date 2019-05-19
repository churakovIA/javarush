package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth() {
        return 777;
    }
    public String getDescription(){
        return super.getDescription() + String.format(" Моя страна - %s. Я несу %s яиц в месяц.", Country.MOLDOVA, getCountOfEggsPerMonth());
    }
}
