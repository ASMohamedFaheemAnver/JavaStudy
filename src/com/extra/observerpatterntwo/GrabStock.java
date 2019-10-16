package com.extra.observerpatterntwo;

public class GrabStock {
    public static void main(String[] args){
        StockGrabber stockGrabber = new StockGrabber();

        StockObserver observerOne = new StockObserver(stockGrabber);
        stockGrabber.setIbmPrice(100);
        stockGrabber.setApplePrice(200);
        stockGrabber.setGooglePrice(300);
    }
}
