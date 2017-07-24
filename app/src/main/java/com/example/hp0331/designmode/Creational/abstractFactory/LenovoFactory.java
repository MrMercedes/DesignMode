package com.example.hp0331.designmode.Creational.abstractFactory;

/**
 * Created by Aaron.zhang
 * at  2017/7/17.
 */

public class LenovoFactory extends ComputerFactory{
    @Override
    public DesktopComputer createDesktopcomputer() {
        return new LenovoDesktopComputer();
    }

    @Override
    public NotebookComputer createNotebookcomputer() {
        return new LenovoNotebookComputer();
    }
}
