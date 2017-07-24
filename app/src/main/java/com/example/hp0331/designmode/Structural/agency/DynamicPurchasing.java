package com.example.hp0331.designmode.Structural.agency;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Aaron.zhang
 * at  2017/7/18.
 */

public class DynamicPurchasing implements InvocationHandler{
    private Object mObject;
    public  DynamicPurchasing(Object o){
        mObject=o;
    }
    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        Object result=method.invoke(o,objects);
        return result;
    }
}
