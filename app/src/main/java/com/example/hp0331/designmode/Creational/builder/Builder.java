package com.example.hp0331.designmode.Creational.builder;

/**
 * Created by Aaron.zhang
 * at  2017/7/17.
 */

public abstract class Builder {
    public abstract void buildCpu(String cpu);
    public abstract void buildMainboard(String mainboard);
    public abstract void buildRam(String ram);
    public abstract Computer creat();
}
