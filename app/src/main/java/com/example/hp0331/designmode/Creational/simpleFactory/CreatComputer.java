package com.example.hp0331.designmode.Creational.simpleFactory;

/**
 * Created by Aaron.zhang
 * at  2017/7/17.
 */

public class CreatComputer {
    public static void main(String[]args){
        ComputerFactory.creatComputer("hp").start();
    }
}
