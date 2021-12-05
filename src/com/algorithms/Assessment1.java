package com.algorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Assessment1
{
    public void findTwoNuber(){
        int sumOfInt=7;
        List<Integer> list=new ArrayList() ;
        list.add(5);
        list.add(3);
        list.add(9);
        list.add(4);
        list.add(1);
        list.add(2);
        for(int i=0;i<list.size()-2;i++){
        for(int j=i+1;j< list.size()-1;j++){
            if((list.get(i)+list.get(j))==7){
                System.out.println(list.get(i)+" "+list.get(j));
                break;
            }
        }
        }

    }


}