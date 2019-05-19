package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Human implements Alive{
    private static int nextId = 0;
    private List<Human> children = new ArrayList<>();
    private int id;
    protected int age;
    protected String name;
    protected Size size;
    private BloodGroup bloodGroup;

    public List<Human> getChildren() {
        return Collections.unmodifiableList(children);
    }

    public void setBloodGroup(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public BloodGroup getBloodGroup() {
        return bloodGroup;
    }

    public Human(String name, int age) {
        this.age = age;
        this.name = name;
        this.id = nextId;
        nextId++;
    }

    public void addChild (Human human){
        children.add(human);
    }

    public void removeChild (Human human){
        children.remove(human);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void live() {

    }

    public int getId() {
        return id;
    }

    public void printSize() {
        System.out.println("Рост: " + size.getHeight() + " Вес: " + size.getWeight());
    }

    public String getPosition(){
        return "Человек";
    }

    public void printData() {
        System.out.println(getPosition() + ": " + name);
    }

    //----------------------------

    public class Size{
        public int height;
        public int weight;

        public Size() {
            height = 0;
            weight = 0;
        }

        public int getHeight() {
            return height;
        }

        public int getWeight() {
            return weight;
        }
    }

}