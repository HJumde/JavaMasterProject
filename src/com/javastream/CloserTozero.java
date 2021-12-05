package com.javastream;

import java.util.Arrays;
import java.util.OptionalInt;

public class CloserTozero {
    //find the elements from array which is  closer to zero
    //array contain +ve and -ve both elements
    //if we get same elements closer to zero from +ve and -ve then consider +ve
    //if array is empty then return zero
    public int getCloserToZero(int[] intArr) {
        if (intArr.length > 0) {
            OptionalInt positiveIntOptional = Arrays.stream(intArr).filter(x -> x >0).min();
            OptionalInt negativeIntOptinal = Arrays.stream(intArr).filter(x -> x <0).max();

            if (positiveIntOptional.isPresent()) {
                int positiveInt=positiveIntOptional.getAsInt();
                if(negativeIntOptinal.isPresent()){
                    int negativeInt=negativeIntOptinal.getAsInt();
               return positiveInt<=(-negativeInt)?positiveInt:negativeInt;

                }else{
                    return positiveInt;
                }
            } else {
                if(negativeIntOptinal.isPresent()){
                    return negativeIntOptinal.getAsInt();
                }else{
                    return 0;
                }
            }
        } else {
            return 0;
        }
    }



    public int closerTozeroMethod(int[] intArr){

//        IntStream s1=Arrays.stream(intArr).filter(x -> x >0);
 //       IntStream s2=Arrays.stream(intArr).filter(x->x<0);
        if (intArr.length > 0) {
            OptionalInt positiveIntOptional = Arrays.stream(intArr).filter(x -> x >0).min();
            OptionalInt negativeIntOptinal = Arrays.stream(intArr).filter(x -> x <0).max();
            return positiveIntOptional.isPresent() ? (negativeIntOptinal.isPresent() ? getSelect(positiveIntOptional.getAsInt(), negativeIntOptinal.getAsInt()):
                   positiveIntOptional.getAsInt()):(negativeIntOptinal.isPresent()? negativeIntOptinal.getAsInt():0);

        } else {
            return 0;
        }


    }

    private int getSelect(int positiveInt, int negativeInt){
        return positiveInt<=(-negativeInt)?positiveInt:negativeInt;
    }
}
