package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Singleton obj1 = Singleton.getInstance();
        Helper.ausgabe(obj1);
        obj1.actOnEvent();
        obj1.actOnEvent();
        Helper.ausgabe(obj1.getCounter());
        
        Singleton obj2 = Singleton.getInstance();
        Helper.ausgabe(obj2);
        obj2.actOnEvent();
        obj2.actOnEvent();
        obj2.actOnEvent();
        Helper.ausgabe(obj2.getCounter());
        
    }

}
