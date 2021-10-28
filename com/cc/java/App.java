package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Singleton obj1 = new Singleton();
        Helper.ausgabe(obj1);

        Singleton obj2 = new Singleton();
        Helper.ausgabe(obj2);

    }

}
