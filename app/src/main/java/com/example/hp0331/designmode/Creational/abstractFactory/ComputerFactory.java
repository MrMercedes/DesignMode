package com.example.hp0331.designmode.Creational.abstractFactory;

/**
 * Created by Aaron.zhang
 * at  2017/7/17.
 */

public abstract class ComputerFactory {
    public abstract DesktopComputer createDesktopcomputer();
    public abstract NotebookComputer createNotebookcomputer();
}
