package com.example.hp0331.designmode.Creational.singleton;

/**
 * Created by Aaron.zhang
 * at  2017/7/17.
 */

/**
 * 懒汉模式-线程不安全
 * 申明了一个静态对象，在用户第一次调用时初始化，虽然节约了资源，
 * 但第一次加载时需要实例化，反映稍慢一些，而且在多线程不能正常工作。
 */
public class Singleton2 {
    private static Singleton2 instance;
    private Singleton2(){

    }
    public static Singleton2 getInstance(){
        if (instance==null){
            instance= new Singleton2();
        }
        return instance;
    }
}
