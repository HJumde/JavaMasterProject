package com.recursion;

public class JavaRecursioin {

    //sum of Array Element using Recursion
    public int colllectionRecursion(int[] A, int len) {
        return (A[len - 1] + ((len <= 1) ? 0 : (colllectionRecursion(A, len - 1))));

    }

    //find factorial  of all Array Elements using Recursion
    public int foctorialUsRecursion(int a) {
        return (a * ((a == 1) ? 1 : foctorialUsRecursion(a - 1)));
    }

    //mulptilcation of all element of array
    public int colllectionAddRecursion(int[] A, int len) {
        return (A[len - 1] * ((len <= 1) ? 1 : (colllectionRecursion(A, len - 1))));
    }

}
