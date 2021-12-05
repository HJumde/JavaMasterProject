package com.kishor.javaarray;

import java.util.Arrays;

public class JavaArray {
    //there are two way to declared the array as given

    public void arrayCopyDemo() {
            String[] copyFrom = {
                    "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                    "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                    "Marocchino", "Ristretto" };

        //String[] copyTo = new String[7];
         //   System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        String[] copyTo = Arrays.copyOfRange(copyFrom, 2, 9);

        for (String coffee : copyTo) {
                System.out.println(coffee + " ");
            }

        int[] intArr= new int[10];
        System.out.println("Length of Array="+intArr);
        for(int x:intArr){
            System.out.println("values are given below="+x);
        }

      }





}
