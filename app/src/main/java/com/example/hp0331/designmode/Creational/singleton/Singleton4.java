package com.example.hp0331.designmode.Creational.singleton;

/**
 * Created by Aaron.zhang
 * at  2017/7/17.
 */

/**
 * 双重检查-DCL
 * 这种写法在getSingleton方法中对singleton进行了两次判空，
 * 第一次是为了不必要的同步，第二次是在singleton等于null的情况下才创建实例
 * 资源利用率高，第一次执行getInstance时单例对象才被实例化，效率高。
 * 缺点是第一次加载时反应稍慢一些，在高并发环境下也有一定的缺陷
 */
public class Singleton4 {
    private static volatile Singleton4 instance ;
    private Singleton4(){

    }
    public static Singleton4 getInstance(){
        if (instance==null){
            synchronized (Singleton4.class){
                if (instance==null){
                    instance=new Singleton4();
                }
            }
        }
        return instance;
    }
}
