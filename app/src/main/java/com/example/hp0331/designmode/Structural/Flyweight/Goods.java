package com.example.hp0331.designmode.Structural.Flyweight;

/**
 * Created by Aaron.zhang
 * at  2017/7/20.
 */

public class Goods implements IGoods{
    private String name;
    private String version;
    Goods(String name){
        this.name=name;
    }
    @Override
    public void showGoodprice(String version) {
        if (version.equals("32G")){
            System.out.println("价格为5199元");
        }else if (version.equals("128G")){
            System.out.println("价格为5999元");
        }
    }
}
