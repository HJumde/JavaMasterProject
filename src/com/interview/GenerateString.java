package com.interview;

import java.util.*;

public class GenerateString {

    public  String getString(int A, int B, int C) {
        StringBuilder strbuidl = new StringBuilder();
        while (A != 0 || B != 0 || C != 0) {
            List<Map.Entry<Character, Integer>> list = getSortedList(A, B, C);
            int higher = list.get(0).getValue();
            int middle = list.get(1).getValue();
            int lower = list.get(2).getValue();

            if (middle == 0 && lower == 0) {
                strbuidl = (higher >= 2) ? strbuidl.append(list.get(0).getKey()).append(list.get(0).getKey()) : strbuidl.append(list.get(0).getKey());
                break;
            } else {
                if (higher / 2 > middle) {
                    strbuidl.append(list.get(0).getKey()).append(list.get(0).getKey());
                    A = A - 2;
                    if (middle != 0) {
                        strbuidl.append(list.get(1).getKey());
                        B--;
                    }
                    if (lower != 0) {
                        strbuidl.append(list.get(2).getKey());
                        C--;
                    }
                }else {
                    strbuidl.append(list.get(0).getKey()).append(list.get(0).getKey());
                    A = A - 2;
                    if (middle != 0) {
                        strbuidl.append(list.get(1).getKey()).append(list.get(1).getKey());
                        B=B-2;
                    }
                    if (lower != 0) {
                        if(middle/2 > lower) {
                            strbuidl.append(list.get(2).getKey());
                            C--;

                        }else{
                            strbuidl.append(list.get(2).getKey()).append(list.get(2).getKey());
                            C=C-2;

                        }
                    }
                }
            }
        }
        return strbuidl.toString();
    }


    private static List getSortedList(int A, int B, int C) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('a', A);
        map.put('b', B);
        map.put('c', C);

        Set<Map.Entry<Character, Integer>> set = map.entrySet();
        List<Map.Entry<Character, Integer>> list = new ArrayList<Map.Entry<Character, Integer>>(set);
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return -(o1.getValue().compareTo(o2.getValue()));

            }
        });
        return list;
    }

}
