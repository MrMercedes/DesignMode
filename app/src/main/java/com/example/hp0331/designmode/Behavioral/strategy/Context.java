package com.example.hp0331.designmode.Behavioral.strategy;

/**
 * Created by Aaron.zhang
 * at  2017/7/19.
 */

public class Context {
    private FightingStrategy fightingStrategy;
    public Context(FightingStrategy fightingStrategy) {
        this.fightingStrategy = fightingStrategy;
    }
    public void fighting(){
        fightingStrategy.fighting();
    }
}
