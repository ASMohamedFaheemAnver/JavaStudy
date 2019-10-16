package com.extra.observer.observerpattern;

import java.util.Observable;
import java.util.Observer;

public class ObserverOneDemo implements Observer {

    private static ObservableDemo weatherUpdate;

    @Override
    public void update(Observable observable, Object o) {
        weatherUpdate = (ObservableDemo) observable;
    }

    public static void main(String[] args){
        ObservableDemo observableDemo = new ObservableDemo(null);
        observableDemo.addObserver(new ObserverOneDemo());
        observableDemo.setWeather("Sunny");
        System.out.println(weatherUpdate.getWeather());
        System.out.println("Testing");
        System.out.println("Testing");
        System.out.println("Testing");
        System.out.println("Testing");
        System.out.println("Testing");
    }
}
