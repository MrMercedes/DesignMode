package com.example.hp0331.designmode.Creational.factory;

/**
 * Created by Aaron.zhang
 * at  2017/7/17.
 */

public class GDComputerFactor extends ComputerFactory{

    @Override
    public <T extends Computer> T creatComputer(Class<T> clz) {
        Computer computer=null;
        String classname=clz.getName();
        try {
            computer=(Computer) Class.forName(classname).newInstance();

        }catch (Exception e){
            e.printStackTrace();
        }
        return (T)computer;
    }
}
