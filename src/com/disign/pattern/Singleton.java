package com.disign.pattern;

import java.io.Serializable;

public class
Singleton implements Cloneable, Serializable {
    static Singleton singleton;
    private Singleton(){}

    public synchronized  static  Singleton getSingleton(){

        if(singleton==null){

            return new Singleton();
        }else {

            return singleton;
        }

    }



}