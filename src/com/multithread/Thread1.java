package com.multithread;

public class Thread1 extends Thread {
    Message msg;

    public Thread1(Message msg){
    this.msg=msg;
    }

    public void run(){

        synchronized(msg){

            msg.sendMsg();

    }
    }


}
