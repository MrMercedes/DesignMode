package com.example.hp0331.designmode.Behavioral.observer;

/**
 * Created by Aaron.zhang
 * at  2017/7/18.
 */

public class WeiXinUser implements Observer {
    private String name;
    public WeiXinUser(String name){
        this.name=name;
    }
    @Override
    public void update(String message) {
    System.out.println(name+"+"+message);
    }
}
