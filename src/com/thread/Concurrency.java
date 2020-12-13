package com.thread;

class RunnableThread implements Runnable{

    private String threadName;
    public Thread t;
    private boolean suspended = false;

    RunnableThread(String threadName){
        this.threadName = threadName;
        System.out.println("Creating " + threadName + ".");
    }

    @Override
    public void run() {
        System.out.println("Running " + threadName + ".");
        try {
            for (int i = 4; i>0; i--){
                System.out.println("Thread : " + threadName + ", " + i + ".");
                Thread.sleep(300);

                synchronized (this){
                    System.out.println(threadName + " is performing synchronized(this)!");

                    while (suspended){
                        System.out.println(threadName + " is waiting!");
                        wait();
                    }
                }
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

    void suspend(){
        this.suspended = true;
    }

    synchronized void resume(){
        this.suspended = false;
        notify();
    }
}

public class Concurrency {
    public static void main(String[] args){
        RunnableThread rOne = new RunnableThread("Thread:1");
        rOne.start();

        RunnableThread rTwo = new RunnableThread("Thread:2");
        rTwo.start();

        try {
            Thread.sleep(500);
            rOne.suspend();
            System.out.println("Suspending Thread:1");

            Thread.sleep(500);
            rOne.resume();
            System.out.println("Resuming Thread:1");

            rTwo.suspend();
            System.out.println("Suspending Thread:2");
            Thread.sleep(500);
            rTwo.resume();
            System.out.println("Resuming Thread:2");
        }catch (InterruptedException e){
            System.out.println("Main thread interrupted!");
        } try {
            System.out.println("Waiting for threads to finish!");
            // We are asking out main thread to wait for rOne and rTwo to finish their tasks
            rOne.t.join();
            rTwo.t.join();
        }catch (InterruptedException e){
            System.out.println("Main thread interrupted!");
        }
        System.out.println("Main thread exiting!");
    }
}
