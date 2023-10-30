package com.homework1;

public class Room {
    private int value;


    public Room(int value) {

        this.value = value;
    }

    public int getValue() {

        return value;
    }

    public void setValue(int value) {

        this.value = value;
    }
    void print1 (){

        System.out.println("колличество комнат " + value);
    }
}
