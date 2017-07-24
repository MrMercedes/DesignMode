package com.example.hp0331.designmode.Behavioral.observer;

/**
 * Created by Aaron.zhang
 * at  2017/7/18.
 */

public class Client {
    public static void main(String [] args){
        SubscriptionSubject subscriptionSubject=new SubscriptionSubject();
        WeiXinUser user1=new WeiXinUser("John");
        WeiXinUser user2=new WeiXinUser("Tom");
        WeiXinUser user3=new WeiXinUser("Coco");

        subscriptionSubject.attach(user1);
        subscriptionSubject.attach(user2);
        subscriptionSubject.attach(user3);

        subscriptionSubject.notify("大头大头下雨不愁别人有伞我有大头");
    }
}
