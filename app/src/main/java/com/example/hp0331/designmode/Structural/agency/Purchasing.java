package com.example.hp0331.designmode.Structural.agency;

/**
 * Created by Aaron.zhang
 * at  2017/7/18.
 */

public class Purchasing implements IShop{
    private IShop mIShop;
    public Purchasing(IShop iShop){
        mIShop=iShop;
    }
    @Override
    public void buy() {
        mIShop.buy();
    }
}
