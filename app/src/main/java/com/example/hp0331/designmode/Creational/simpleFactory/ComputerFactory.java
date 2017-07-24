package com.example.hp0331.designmode.Creational.simpleFactory;

/**
 * Created by Aaron.zhang
 * at  2017/7/17.
 */

public class ComputerFactory {
    public static Computer creatComputer(String type){
        Computer computer=null;
        switch (type){
            case "lenovo":
                computer=new LenovoComputer();
                break;
            case "hp":
                computer=new HpComputer();
                break;
            case "asus":
                computer=new AsusComputer();
                break;
        }
        return computer;
    }
}
