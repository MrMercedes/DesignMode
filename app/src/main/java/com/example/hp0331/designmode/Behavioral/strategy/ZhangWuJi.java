package com.example.hp0331.designmode.Behavioral.strategy;

/**
 * Created by Aaron.zhang
 * at  2017/7/19.
 */

public class ZhangWuJi {
    public static void main(String[] args) {
        Context context;
        //如果遇到弱的对手
        context = new Context(new WeakRivalStrategy());
        context.fighting();
        //如果遇到普通的对手
        context = new Context(new CommonRivalStrategy());
        context.fighting();
        //如果遇到强劲的对手
        context = new Context(new StrongRivalStrategy());
        context.fighting();
    }
}
