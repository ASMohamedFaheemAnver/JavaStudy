package com.extra.observer.observerpatternwiththread;

import java.util.concurrent.TimeUnit;

public class ASimpleClass {
    void doSomeThing() throws InterruptedException {
        for (int i = 0; i<20; i++){
            System.out.println(i);
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
