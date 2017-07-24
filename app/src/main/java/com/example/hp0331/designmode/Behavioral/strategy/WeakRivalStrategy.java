package com.example.hp0331.designmode.Behavioral.strategy;

/**
 * Created by Aaron.zhang
 * at  2017/7/19.
 */

public class WeakRivalStrategy implements FightingStrategy{
    @Override
    public void fighting() {
        System.out.println("遇到了较弱的对手，张无忌使用太极剑");
    }
}
