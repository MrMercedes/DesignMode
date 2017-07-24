package com.example.hp0331.designmode.Creational.factory;

/**
 * Created by Aaron.zhang
 * at  2017/7/17.
 */

public class Client {
    public static void main(String[]args) {
        ComputerFactory computerFactory = new GDComputerFactor();
       LenovoComputer lenovoComputer=computerFactory.creatComputer(LenovoComputer.class);
       lenovoComputer.start();
       HpComputer hpComputer=computerFactory.creatComputer(HpComputer.class);
       hpComputer.start();
       AsusComputer asusComputer=computerFactory.creatComputer(AsusComputer.class);
       asusComputer.start();
       AppleComputer appleComputer=computerFactory.creatComputer(AppleComputer.class);
       appleComputer.start();
    }
}
