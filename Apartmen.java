package com.homework1;

public class Apartmen {
    private int value;
    private Room room;


    public Apartmen(int value, Room room) {
        this.value = value;
        this.room = room;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    void print2() {
        System.out.println("этаж " + value + " ,колличество комнат "+ room.getValue());
    }
}