package com.example.hp0331.designmode.Behavioral.mediator;

/**
 * Created by Aaron.zhang
 * at  2017/7/19.
 */

public class Wudang extends United {
    public Wudang(WulinAlliance wulinAlliance) {
        super(wulinAlliance);
    }
    public void sendAlliance(String message) {
        wulinAlliance.notice(message, this);
    }
    public void getNotice(String message) {
        System.out.println("武当收到消息：" + message);
    }
}
