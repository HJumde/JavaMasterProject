package com.java8feature;

public class LamdaExpression {

    public void lamdaImpl(){
    Runnable runable=() ->{
        System.out.println("Welcome inthe lamda expression using Runaable interface");
    };

    runable.run();
    }
}
