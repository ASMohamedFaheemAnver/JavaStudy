package com.extra.observer.observerpatternwiththread;

public class ThreadMaker extends Observable implements ObserveR{

    void doSomeProcess(int someValue){
        Runnable anyThing = new ThreadClass(someValue);
        ((ThreadClass)anyThing).register(this);
        new Thread(anyThing).start();
    }

    void getFinalMessage(){
        System.out.println("All over!");
    }

    @Override
    public void update() { // can send flags and messages
        notifyObserver();
    }
}
