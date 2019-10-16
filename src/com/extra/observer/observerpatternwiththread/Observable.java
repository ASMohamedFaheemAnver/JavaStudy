package com.extra.observer.observerpatternwiththread;

import java.util.ArrayList;

public class Observable {
    private ArrayList<ObserveR> observeRS;

    public Observable(){
        observeRS = new ArrayList<>();
    }

    public void register(ObserveR o){
        observeRS.add(o);
    }

    public void notifyObserver(){
        for (ObserveR observeR : observeRS){
            observeR.update();
        }
    }
}
