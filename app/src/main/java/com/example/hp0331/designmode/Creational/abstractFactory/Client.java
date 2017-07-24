package com.example.hp0331.designmode.Creational.abstractFactory;

/**
 * Created by Aaron.zhang
 * at  2017/7/17.
 */

public class Client {
    public static void main(String [] args){
        ComputerFactory lenocoFactory=new LenovoFactory();
        lenocoFactory.createDesktopcomputer().start();
        lenocoFactory.createNotebookcomputer().start();
        ComputerFactory hpFactory=new HpFactory();
        hpFactory.createDesktopcomputer().start();
        hpFactory.createNotebookcomputer().start();
    }
}
