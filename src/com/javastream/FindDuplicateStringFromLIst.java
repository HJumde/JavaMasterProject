package com.javastream;

import java.net.Inet4Address;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateStringFromLIst {

    public List getDuplicateList(List<String> listString) {
        return listString.stream()
                .collect(Collectors.groupingBy(Function.identity()
                        , Collectors.counting()))    // create a map {1=1, 2=1, 3=2, 4=2, 5=1, 7=1, 9=2}
                .entrySet().stream()                 // Map -> Stream
                .filter(m -> m.getValue() > 1)       // if map value > 1, duplicate element
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    public int findDupicateProduct(List<String> name, List<Integer> price, List<Integer> weight) {
        List<String> finalList = new LinkedList<String>();
        for (int i = 0; i < name.size(); i++) {
            finalList.add(name.get(i) + price.get(i) + weight.get(i));
        }

        return finalList.stream()
                .collect(Collectors.groupingBy(Function.identity()
                        , Collectors.counting()))    // create a map {1=1, 2=1, 3=2, 4=2, 5=1, 7=1, 9=2}
                .entrySet().stream()                 // Map -> Stream
                .filter(m -> m.getValue() > 1)       // if map value > 1, duplicate element
                .map(Map.Entry::getKey)
                .collect(Collectors.toList()).size();


    }

    public int check() {
        List<String> name = new LinkedList<String>();
        List<Integer> price = new LinkedList<Integer>();
        List<Integer> weight = new LinkedList<Integer>();
        name.add("puma");
        name.add("puma");
        name.add("puma");
        name.add("jio");
        name.add("jio");
        price.add(10);
        price.add(10);
        price.add(10);
        price.add(12);
        price.add(12);
        weight.add(50);
        weight.add(50);
        weight.add(50);
        weight.add(40);
        weight.add(40);

        return findDupicateProduct(name,price,weight);


    }


}