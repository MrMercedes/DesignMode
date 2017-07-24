package com.example.hp0331.designmode.Creational.builder;

/**
 * Created by Aaron.zhang
 * at  2017/7/17.
 */

public class CreatComputer {
    public static void main(String[]args){
        Builder mBuilder=new MoonComputerBuilder();
       Director director=new Director(mBuilder);
        director.creatComputer("","","");
    }
}
