package com.javacoding;

public class InterQue {

    public int colllectionRecursion(int[] A,int len){
    return (((len<=1)?0:(colllectionRecursion(A,len-1)))+A[len-1]);
    }

    public int foctorialUsRecursion(int a){
    return(a*((a==1)?1:foctorialUsRecursion(a-1)));
    }

    public int colllectionAddRecursion(int[] A,int len){
    return (A[len-1]*((len<=1)?1:(colllectionRecursion(A,len-1))));
    }


}
