package com.extra.thread;

public class GetMail implements Runnable{
    private int startTime;

    public GetMail(int startTime){
        this.startTime = startTime;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(startTime*1000);
        }catch (InterruptedException e){

        }
        System.out.println("Checking mail!");
    }
}
