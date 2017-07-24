package com.example.hp0331.designmode.Structural.agency;

import java.lang.reflect.Proxy;

/**
 * Created by Aaron.zhang
 * at  2017/7/18.
 */

public class Client {
    public static void main(String [] args){
        IShop zxy=new ZXY();
//        IShop purchasing=new Purchasing(zxy);
//        purchasing.buy();
        DynamicPurchasing dynamicPurchasing=new DynamicPurchasing(zxy);

        ClassLoader classLoader=zxy.getClass().getClassLoader();

        IShop purchasing= (IShop) Proxy.newProxyInstance(classLoader,new Class[]{IShop.class},dynamicPurchasing);
        purchasing.buy();
    }
}
