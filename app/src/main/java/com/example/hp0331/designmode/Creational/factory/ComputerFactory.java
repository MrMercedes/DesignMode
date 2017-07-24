package com.example.hp0331.designmode.Creational.factory;

/**
 * Created by Aaron.zhang
 * at  2017/7/17.
 */

public abstract class ComputerFactory {
    public abstract <T extends Computer>T creatComputer(Class<T> clz);
}
