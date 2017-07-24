package com.example.hp0331.designmode.Structural.Decorator;

/**
 * Created by Aaron.zhang
 * at  2017/7/20.
 */

public class OuYangFeng extends Master {
    public OuYangFeng(Swordsman swordsman) {
        super(swordsman);
    }
    public void teachAttackMagic(){
        System.out.println("欧阳锋教授蛤蟆功");
        System.out.println("杨过使用蛤蟆功");
    }
    @Override
    public void attackMagic() {
        super.attackMagic();
        teachAttackMagic();
    }
}
