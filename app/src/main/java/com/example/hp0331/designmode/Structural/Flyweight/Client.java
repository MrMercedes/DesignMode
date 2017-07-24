package com.example.hp0331.designmode.Structural.Flyweight;

/**
 * Created by Aaron.zhang
 * at  2017/7/20.
 */

public class Client {
    public static void main(String[]args) {
        Goods goods1=GoodsFactory.getGoods("iphone7");
        goods1.showGoodprice("32G");
        Goods goods2=GoodsFactory.getGoods("iphone7");
        goods2.showGoodprice("32G");
        Goods goods3=GoodsFactory.getGoods("iphone7");
        goods3.showGoodprice("128G");
    }
}
