package com.multithread;

public class Message {
   public void sendMsg(){

for(int i=1;i<=50;i++) {

    System.out.println(Thread.currentThread().getName() + "=" + i);

if(i==10)
{
    try {
        this.wait();
    }catch(InterruptedException iex){
        System.err.println("Get Error");
    }
}
}
    }
}
