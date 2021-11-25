package com.string.operations;

import com.sorting.Employee;

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

    public char getMostOccuranceCharInStringUsingJava8(String str) {

        char[] list = str.toLowerCase().toCharArray();
        Stream<Character> charStream = new String(list).chars().mapToObj(i->(char)i);
        Map<Character,Long> map1=charStream.collect(Collectors.groupingBy(x->x,Collectors.counting()));
        return map1.entrySet().stream().max(comparingByValue()).get().getKey();


    }

    public char maximumOccuringChar(String str) {
        return str.chars()
                .mapToObj(x -> (char) x)                  // box to Character
                .collect(groupingBy(x -> x, counting()))  // collect to Map<Character, Long>
                .entrySet().stream()
                .max(comparingByValue())                  // find entry with largest count
                .get()                                    // or throw if source string is empty
                .getKey();
    }


}



