package com.javastream;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStream {

    public void parallelStreamProcess(){
        List<Integer> list =new LinkedList<Integer>();
        for(int i=0;i<100000;i++){
            list.add(i);
        }

        long input1=System.currentTimeMillis();
        Integer  integer=list.stream().max(Comparator.comparing(Integer::valueOf)).get();
        long input2=System.currentTimeMillis();
        System.out.println("time taken by Seq Stream="+(input2-input1));



        long input3=System.currentTimeMillis();
        Integer  integer2=list.parallelStream().max(Comparator.comparing(Integer::valueOf)).get();
        long input4=System.currentTimeMillis();
        System.out.println("time taken by Seq Stream="+(input4-input3));



    }

}
