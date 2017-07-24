package com.example.hp0331.designmode.Behavioral.mediator;

/**
 * Created by Aaron.zhang
 * at  2017/7/19.
 */

public class Emei extends United {
    public Emei(WulinAlliance wulinAlliance) {
        super(wulinAlliance);
    }
    public void sendAlliance(String message) {
        wulinAlliance.notice(message, Emei.this);
    }
    public void getNotice(String message) {
        System.out.println("峨眉收到消息：" + message);
    }
}
