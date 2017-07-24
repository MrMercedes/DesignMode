package com.example.hp0331.designmode.Behavioral.state;

/**
 * Created by Aaron.zhang
 * at  2017/7/20.
 */

public class PowerOffState implements Mp3State{
    @Override
    public void powerOn() {
        System.out.println("开机");
    }

    @Override
    public void powerOff() {

    }

    @Override
    public void preSong() {

    }

    @Override
    public void nextSong() {

    }
}
