package com.example.hp0331.designmode.Creational.builder;

/**
 * Created by Aaron.zhang
 * at  2017/7/17.
 */

public class Computer {
    private String mCpu;
    private String mMainboard;
    private String mRam;

    public void setCpu(String cpu) {
        mCpu = cpu;
    }

    public void setMainboard(String mainboard) {
        mMainboard = mainboard;
    }

    public void setRam(String ram) {
        mRam = ram;
    }
}
