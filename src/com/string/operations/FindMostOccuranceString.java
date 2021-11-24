package com.string.operations;

import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
}



