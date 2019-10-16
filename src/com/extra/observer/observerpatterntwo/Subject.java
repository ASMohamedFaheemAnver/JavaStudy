package com.extra.observer.observerpatterntwo;

public interface Subject {
    public void register(ObserverE o);
    public void unregister(ObserverE o);
    public void notifyObserver();
}
