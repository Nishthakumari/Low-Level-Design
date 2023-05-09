package com.example.ObserverPattern;

import com.example.ObserverPattern.Observable.IphoneObservaleImpl;
import com.example.ObserverPattern.Observable.StockObservable;
import com.example.ObserverPattern.Observer.EmailAlertObserverImpl;
import com.example.ObserverPattern.Observer.MobileAlertObserverImpl;
import com.example.ObserverPattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StockObservable iphoneStockObservable = new IphoneObservaleImpl();

        NotificationAlertObserver observer1 =
                new EmailAlertObserverImpl("xyz1@gmail.com",iphoneStockObservable );

        NotificationAlertObserver observer2 =
                new EmailAlertObserverImpl("xyz2@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer3 =
                new MobileAlertObserverImpl("xyz_username", iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);

    }
}
