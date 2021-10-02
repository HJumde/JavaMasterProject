package com.java8feature;

import java.util.ArrayList;
import java.util.List;

public class ExampleoFJava8 {

public void ex_forEach(){
List<Integer> list =new ArrayList<Integer>();
for(int i=0;i<=10; i++) list.add(i);
list.forEach(x->System.out.println("value="+x));

}
}
