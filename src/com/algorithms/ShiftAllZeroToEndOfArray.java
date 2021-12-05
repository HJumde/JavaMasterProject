package com.algorithms;

import java.util.Arrays;

public class ShiftAllZeroToEndOfArray {
    public void shiftAllZeroToEndOFArrayS(int[] A) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                for (int b = i + 1; b < A.length; b++) {
                    if (A[b] != 0) {
                        A[i] = A[b];
                        A[b] = 0;
                        break;
                    }
                }
            }
        }

        for(int intVlaue:A){
            System.out.println(intVlaue+" ");
        }
    }


}
