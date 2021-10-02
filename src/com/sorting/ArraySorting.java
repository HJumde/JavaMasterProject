package com.sorting;

import java.util.*;

public class ArraySorting {

    public void arraySort(){
        String[] strArry={"kishor","kishor","harsha","harsha","nisha","rahuk","aditi","aditi","aditi","gopal","gopal","gopal","gopal","mohini","mohini","mohini","mohini"};
        HashMap<String, Integer> hm=new HashMap<String,Integer>();
        for(String str:strArry){
        if(hm.containsKey(str)){
            hm.put(str,hm.get(str)+1);
        }else{
            hm.put(str,1);

        }
        }

        Set<Map.Entry<String,Integer>> set=hm.entrySet();
List<Map.Entry<String,Integer>> list=new ArrayList<Map.Entry<String,Integer>>(set);
Collections.sort(list,new Comparator<Map.Entry<String,Integer>>(){
    @Override
    public int compare(Map.Entry<String, Integer> m1, Map.Entry<String, Integer> m2) {
        return -(m1.getValue().compareTo(m2.getValue()));

    }
});

        Collections.sort(list,new Comparator<Map.Entry<String,Integer>>(){
            @Override
            public int compare(Map.Entry<String, Integer> m1, Map.Entry<String, Integer> m2) {
                return m1.getKey().compareTo(m2.getKey());

            }
        });

for(Map.Entry<String,Integer> entry:list) {
    System.out.println("name=" + entry.getKey() + "   " + "value=" + entry.getValue());
}

    }

}
