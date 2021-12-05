package com.algorithms;

public class FebonacciSeries {

    //create FebonacciSeries using for loop
    public void createFBS(int a,int b,int len){
        String    str=a+" "+b;
        len=len-2;
        for(;len>0;len--){
            b=a+b;
            a=b-a;
            str=str+" "+b;
        }
        System.out.println(str);
    }

    //create FebonacciSeries using while loop
    public void createFBSUsingWhile(int a,int b,int len){
        String    str=a+" "+b;
        len=len-2;
        while(len>0){
            b=a+b;
            a=b-a;
            str=str+" "+b;
            len--;
        }
        System.out.println(str);
    }

    //create FebonacciSeries using recursion
    public String createFBSeriesUsingRecusion(int a,int b,int len){
        return (a+" "+((len<=0)? ""+(b): createFBSeriesUsingRecusion(b,(a+b),len-1) ));
    }
}
