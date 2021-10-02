package com.javastream;

import java.util.*;
import java.util.stream.*;

public class JavaStream {


public int findMaxwithMultipleOf7(int[] intArr){
    OptionalInt intOptional =Arrays.stream(intArr).filter(x -> (x%7==0)).max();
    if(intOptional.isPresent()) {
    return intOptional.getAsInt();
   }else{
       return 0;
   }
   }

}