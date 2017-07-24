package com.example.hp0331.designmode.Creational.singleton;

/**
 * Created by Aaron.zhang
 * at  2017/7/17.
 */

/**
 * 静态内部类单例模式
 * 第一次加载Singleton类时并不会初始化sInstance，只有第一次调用getInstance方法时虚拟机加载SingletonHolder
 * 并初始化sInstance ，这样不仅能确保线程安全也能保证Singleton类的唯一性
 */
public class Singleton5 {

    private Singleton5(){

    }
    public static Singleton5 getInstance(){
        return SingleHolder.instance;
    }

    public static class SingleHolder{
        private static final Singleton5 instance=new Singleton5();
    }
}
