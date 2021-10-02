package com.java8feature;

import com.sun.xml.internal.fastinfoset.util.CharArrayIntMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreamApi {

public void exStream(){
      List<Integer> list=new ArrayList<Integer>();
      for(int i=1;i<=10;i++) list.add(i);

      /*Optional<Integer> intOptional =list.stream().reduce((x1, x2)-> {return  x1+x2;});
      System.out.println(intOptional.get());
      IntStream abc="KishorJumde".chars();
*/

//Here we have see that stream cannot be reuse
      Stream<Integer> stream1=list.stream();
  //  Optional<Integer> first=stream1.max();
    //System.out.println("value of Integer="+first.get());

    //  int sum1=stream1.filter(i -> i < 4).mapToInt(i -> i).sum();
      //System.out.println("sum less than 4="+sum1);

/*
      int sum2=stream1.filter(i -> i > 4).mapToInt(i -> i).sum();
      System.out.println("sum greater than 4="+sum2);
*/
 }
 }

