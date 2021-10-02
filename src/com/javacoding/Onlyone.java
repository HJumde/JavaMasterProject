package com.javacoding;

import com.sun.org.apache.xerces.internal.parsers.CachingParserPool;
//implimentation of Singleton Java
import java.io.Serializable;

public class Onlyone implements Cloneable, Serializable {
private static Onlyone onlyone;
private Onlyone(){}

synchronized  static Onlyone getOnlyone() {
    if(onlyone==null){
        onlyone=new Onlyone();
    }
return onlyone;
}
 public Object clone() throws CloneNotSupportedException{
    throw new CloneNotSupportedException();
 }
 public Object readResolve(){
     return onlyone;

 }
 }
