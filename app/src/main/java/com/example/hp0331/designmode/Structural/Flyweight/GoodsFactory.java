package com.example.hp0331.designmode.Structural.Flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Aaron.zhang
 * at  2017/7/20.
 */

public class GoodsFactory {
    private static Map<String,Goods> pool=new HashMap<>();
    public static Goods getGoods(String name){
        if (pool.containsKey(name)){
            System.out.println("使用缓存,key为:"+name);
            return pool.get(name);
        }else {
            Goods goods=new Goods(name);
            pool.put(name,goods);
            System.out.println("创建商品,key为:"+name);
            return goods;
        }
    }
}
