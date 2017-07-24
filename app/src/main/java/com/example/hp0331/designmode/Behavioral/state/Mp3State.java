package com.example.hp0331.designmode.Behavioral.state;

/**
 * Created by Aaron.zhang
 * at  2017/7/20.
 */

public interface Mp3State {
    //开机
    public void powerOn();
    //关机
    public void powerOff();
    //上一首歌曲
    public void preSong();
    //下一首歌曲
    public void nextSong();
}
