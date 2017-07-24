package com.example.hp0331.designmode.Structural.Decorator;

/**
 * Created by Aaron.zhang
 * at  2017/7/20.
 */

public abstract class Master extends Swordsman{
    private Swordsman mSwordsman;
    public  Master(Swordsman swordsman){
        this.mSwordsman=swordsman;
    }
    @Override
    public void attackMagic() {
        mSwordsman.attackMagic();
    }
}
