package com.example.hp0331.designmode.Creational.builder;

/**
 * Created by Aaron.zhang
 * at  2017/7/17.
 */

public class MoonComputerBuilder extends Builder {
    private Computer mComputer=new Computer();
    @Override
    public void buildCpu(String cpu) {
        mComputer.setCpu(cpu);
    }

    @Override
    public void buildMainboard(String mainboard) {
        mComputer.setMainboard(mainboard);
    }

    @Override
    public void buildRam(String ram) {
        mComputer.setRam(ram);
    }

    @Override
    public Computer creat() {
        return mComputer;
    }
}
