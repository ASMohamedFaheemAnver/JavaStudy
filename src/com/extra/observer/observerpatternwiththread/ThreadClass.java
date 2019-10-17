package com.extra.observer.observerpatternwiththread;

import java.util.concurrent.TimeUnit;

public class ThreadClass extends Observable implements Runnable{
    private int someValue;

    public ThreadClass(int someValue) {
        this.someValue = someValue;
    }

    @Override
    public void run() {
        for (int i = 0; i<20; i++){
            someValue++;
            System.out.println(someValue);

            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        notifyObserver();
    }
}
