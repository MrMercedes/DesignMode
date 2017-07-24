package com.example.hp0331.designmode.Creational.builder;

/**
 * Created by Aaron.zhang
 * at  2017/7/17.
 */

public class Director {
    Builder mBuilder=null;
    public Director(Builder builder){
        this.mBuilder=builder;
    }
    public Computer creatComputer(String cpu,String mainboard,String ram){
        this.mBuilder.buildMainboard(mainboard);
        this.mBuilder.buildCpu(cpu);
        this.mBuilder.buildRam(ram);
        return mBuilder.creat();
    }
}
