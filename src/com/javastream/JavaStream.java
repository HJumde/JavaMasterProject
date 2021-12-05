package com.javastream;

import java.util.*;
import java.util.stream.*;

public class JavaStream {


    public int findMaxwithMultipleOf7(int[] intArr) {
        OptionalInt intOptional = Arrays.stream(intArr).filter(x -> (x % 7 == 0)).max();
        if (intOptional.isPresent()) {
            return intOptional.getAsInt();
        } else {
            return 0;
        }
    }

    public void getSumOfPrimenUmber() {
        int sum = IntStream.range(1, 1000).filter(x -> (x % 2 != 0 && x % 3 != 0 && x % 5 != 0)).sum();
        //int sum=IntStream.range(1,1000).filter(x->(x%2!=0 && x%3!=0 && x%5!=0)).reduce((x,y)->x+y).getAsInt();
        System.out.println("Sum of All prime number from 1 to 1000 as given below=" + sum);
        System.out.println("======================================================");
        IntStream.range(1, 1000).filter(x -> (x % 2 != 0 && x % 3 != 0 && x % 5 != 0)).forEach(System.out::println);
    }

}