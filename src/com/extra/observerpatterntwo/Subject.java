package com.extra.observerpatterntwo;

import java.util.Observer;

public interface Subject {
    public void register(ObserverE o);
    public void unregister(ObserverE o);
    public void notifyObserver();
}
