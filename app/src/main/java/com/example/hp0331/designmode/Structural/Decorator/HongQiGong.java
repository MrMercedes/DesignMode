package com.example.hp0331.designmode.Structural.Decorator;

/**
 * Created by Aaron.zhang
 * at  2017/7/20.
 */

public class HongQiGong extends Master {
    public HongQiGong(Swordsman mSwordsman) {
        super(mSwordsman);
    }
    public void teachAttackMagic(){
        System.out.println("洪七公教授打狗棒法");
        System.out.println("杨过使用打狗棒法");
    }
    @Override
    public void attackMagic() {
        super.attackMagic();
        teachAttackMagic();
    }
}
