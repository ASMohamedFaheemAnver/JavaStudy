package com.extra.observer.observerpattern;

import java.util.Observable;
import java.util.concurrent.TimeUnit;

public class ObservableDemo extends Observable {
    private String weather;
    public ObservableDemo(String weather){
        this.weather = weather;
    }

    public String getWeather(){
        return weather;
    }

    public void setWeather(String weather){
        this.weather = weather;
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        setChanged();
        notifyObservers();
    }
}
