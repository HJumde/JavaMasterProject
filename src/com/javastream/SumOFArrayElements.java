package com.javastream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SumOFArrayElements {
   public char findFirstReapetedChar(String str){
       Set<Character>  characters  =new HashSet<Character>();

       for(char ch: str.toCharArray()){
          if(characters.contains(ch))
              return ch;
          else characters.add(ch);
       }

   return '\0';
   }

}

