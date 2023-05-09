package com.example.ObserverPattern.Observer;

import com.example.ObserverPattern.Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{

    String userName;
    StockObservable observable;

    public MobileAlertObserverImpl(String emailId, StockObservable observable) {
        this.userName = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendEmail(userName, "product is in stock, hurry up");

    }

    public void sendEmail(String userName, String msg)
    {
        System.out.println("call sent to " + userName);
    }

    
}
