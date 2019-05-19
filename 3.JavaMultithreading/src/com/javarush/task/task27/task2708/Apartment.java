package com.javarush.task.task27.task2708;

public class Apartment {
    private String location;
    private final RealEstate realEstate;

    public Apartment(RealEstate realEstate) {
        this.realEstate = realEstate;
        setLocation(String.valueOf(Math.random() * 10));
    }

    public String getLocation() {
        synchronized(this) {
            return location;
        }
    }

    public void setLocation(String location) {

        synchronized (this) {
            this.location = location;
        }
    }

    public void revalidate(boolean isEmpty) {
        if (isEmpty)
            synchronized (this) {
                realEstate.up(this);
            }
    }
}