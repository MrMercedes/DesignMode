package com.example.hp0331.designmode.Behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aaron.zhang
 * at  2017/7/18.
 */

public class SubscriptionSubject implements Subject {
    private List<Observer> weixinuserlist=new ArrayList<Observer>();
    @Override
    public void attach(Observer observer) {
            weixinuserlist.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        weixinuserlist.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer:weixinuserlist){
            observer.update(message);
        }
    }
}
