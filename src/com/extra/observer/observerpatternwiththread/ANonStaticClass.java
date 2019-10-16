package com.extra.observer.observerpatternwiththread;

public class ANonStaticClass implements ObserveR{
    ThreadMaker anyThread;
    void doStaticWork(){
        anyThread = new ThreadMaker();

        anyThread.register(this);

        anyThread.doSomeProcess(0);
    }

    @Override
    public void update() {
        anyThread.getFinalMessage();
    }
}
