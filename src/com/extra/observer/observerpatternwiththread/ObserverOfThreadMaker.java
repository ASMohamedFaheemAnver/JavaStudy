package com.extra.observer.observerpatternwiththread;

import java.util.concurrent.TimeUnit;

public class ObserverOfThreadMaker{
    public static void main(String[] args) throws InterruptedException {
        ASimpleClass doSomethingTwo = new ASimpleClass();
        doSomethingTwo.doSomeThing();

        ANonStaticClass doSomething = new ANonStaticClass();
        doSomething.doStaticWork();

        for (int j = 0; j<20; j++){
            System.out.println("Some garbage");
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
