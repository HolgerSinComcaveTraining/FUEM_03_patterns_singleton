package com.cc.java;

public class Singleton {
    
    private int counter;

    private static Singleton instance = new Singleton();

    private Singleton(){
        Helper.ausgabe("Singleton Constructor");
    }

    public static Singleton getInstance() {
        return instance;
    }


    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
    
    public void actOnEvent() {
        counter++;
    }
}
