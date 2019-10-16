package com.extra.observerpatterntwo;

import java.util.ArrayList;

public class StockGrabber implements Subject {

    private ArrayList<ObserverE> observers;
    private double ibmPrice;
    private double applePrice;
    private double googlePrice;

    public StockGrabber(){
        observers = new ArrayList<>();
    }

    @Override
    public void register(ObserverE o) {
        observers.add(o);
    }

    @Override
    public void unregister(ObserverE o) {
        int observerIndex = observers.indexOf(o);
        System.out.println("Observer " + (observerIndex+1) + "deleted!");
        observers.remove(observerIndex);
    }

    @Override
    public void notifyObserver() {
        for (ObserverE observer : observers){
            observer.update(ibmPrice, applePrice, googlePrice);
        }
    }

    public void setIbmPrice(double newIBMPrice){
        this.ibmPrice = newIBMPrice;
        notifyObserver();
    }

    public void setApplePrice(double newAPPLEPrice){
        this.applePrice = newAPPLEPrice;
        notifyObserver();
    }

    public void setGooglePrice(double newGOOGLEPrice){
        this.googlePrice = newGOOGLEPrice;
        notifyObserver();
    }
}
