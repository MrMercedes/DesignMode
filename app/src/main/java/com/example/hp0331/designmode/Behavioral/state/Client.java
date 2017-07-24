package com.example.hp0331.designmode.Behavioral.state;

/**
 * Created by Aaron.zhang
 * at  2017/7/20.
 */

public class Client {
    public static void main(String[] args){
        Context context=new Context();
        context.setMp3State(new PowerOffState());
        context.preSong();
        context.powerOn();
        context.nextSong();
        context.powerOff();
    }
}
