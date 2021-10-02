package com.multithread;

public class Thread2 extends Thread {
   Message msg;

   public Thread2(Message msg){
        this.msg=msg;
    }

    public void run(){

        synchronized(msg){
            msg.notifyAll();

            msg.sendMsg();
    }

}
}
