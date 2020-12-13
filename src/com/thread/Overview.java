package com.thread;

class OverviewThread implements Runnable{
    private String threadName;
    private Thread t;

    OverviewThread(String threadName){
        this.threadName = threadName;
        System.out.println("Creating " + threadName + ".");
    }

    @Override
    public void run() {
        System.out.println("Running " + threadName + ".");
        try {
            for (int i = 4; i>0; i--){
                System.out.println("Thread : " + threadName + ", " + i + ".");
                Thread.sleep(50);
            }
        }catch (InterruptedException e){
            System.out.println("Thread " + threadName + " interrupted.");
        }

        System.out.println("Thread " + threadName + " exiting.");
    }

    public void start(){
        System.out.println("Starting " + threadName + ".");
        if(t==null){
            t = new Thread(this, threadName);
            t.start();
        }
    }
}

class OverviewThreadTwo extends Thread{
    private Thread t;
    private String threadName;

    OverviewThreadTwo(String threadName){
        this.threadName = threadName;
    }

    public void run(){
        System.out.println("Running " + threadName + ".");
        try {
            for (int i = 4; i>0; i--){
                System.out.println("Thread : " + threadName + ", " + i + ".");
                Thread.sleep(50);
            }
        }catch (InterruptedException e){
            System.out.println("Thread " + threadName + " interrupted.");
        }

        System.out.println("Thread " + threadName + " exiting.");
    }

    public void start(){
        System.out.println("Starting " + threadName + ".");
        if(t==null){
            t = new Thread(this, threadName);
            t.start();
        }
    }
}

public class Overview {
    public static void main(String[] args){
        /*OverviewThread rOne = new OverviewThread("Thread:1");
        rOne.start();

        OverviewThread rTwo = new OverviewThread("Thread:2");
        rTwo.start();*/

        OverviewThreadTwo rOne = new OverviewThreadTwo("Thread:1");
        rOne.start();

        OverviewThreadTwo rTwo = new OverviewThreadTwo("Thread:2");
        rTwo.start();

    }
}
