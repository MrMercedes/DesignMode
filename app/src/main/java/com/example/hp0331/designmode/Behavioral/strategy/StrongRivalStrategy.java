package com.example.hp0331.designmode.Behavioral.strategy;

/**
 * Created by Aaron.zhang
 * at  2017/7/19.
 */

public class StrongRivalStrategy implements FightingStrategy {
    @Override
    public void fighting() {
        System.out.println("遇到了强大的对手，张无忌使用乾坤大挪移");
    }
}
