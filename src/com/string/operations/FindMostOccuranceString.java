package com.string.operations;


import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class FindMostOccuranceString {

    public void getMostOccuranceCharInString(String str) {
        char[] charArray = str.toLowerCase().toCharArray();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        LinkedHashSet<Character> linkedHashSet = new LinkedHashSet<Character>();
        for (char ch : charArray) {
            linkedHashSet.add(ch);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        Optional<Character> optionalCharacter = linkedHashSet.stream().reduce((a, b) -> map.get(b) > map.get(a) ? b : a);
        System.out.println("Most Occcurance charactor in String in Java=" + optionalCharacter.get());
    }


    //Find Most Occurance Elements from string as given below 
    public int findMostOcuuranceElementOFList(List<Integer> integerList){
    return integerList.stream().collect(Collectors.groupingBy(x->x,Collectors.counting())).entrySet().stream().sorted((Map.Entry.comparingByValue(Comparator.reverseOrder()))).map(Map.Entry::getKey).findFirst().get();
    }

}



