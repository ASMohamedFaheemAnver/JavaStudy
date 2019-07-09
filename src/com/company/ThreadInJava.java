package com.company;

// https://www.geeksforgeeks.org/main-thread-java/
class ChildThread extends Thread{
    @Override
    public void run(){
        for (int i = 0; i<5; i++){
            System.out.println("Child thread");
        }
    }
}

public class ThreadInJava extends Thread{
    public static void main(String[] args){
        Thread mainThread = Thread.currentThread();
        System.out.println("Current thread : " + mainThread.getName());

        mainThread.setName("myrifaThread");
        System.out.println("After name change : " + mainThread.getName());

        System.out.println("Main thread priority : " + mainThread.getPriority());

        mainThread.setPriority(MAX_PRIORITY);

        System.out.println("Main thread new priority : " + mainThread.getPriority());
        for (int i = 0; i<5; i++){
            System.out.println("Main thread");
        }

        ChildThread ct = new ChildThread();

        System.out.println("Child thread priority : " + ct.getPriority());

        ct.setPriority(MIN_PRIORITY);

        System.out.println("Child thread new priority : " + ct.getPriority());

        ct.start();
    }
}
