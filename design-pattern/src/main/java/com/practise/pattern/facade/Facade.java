package com.practise.pattern.facade;

public class Facade {


    private SubSystemA subSystemA = new SubSystemA();
    private SubSystemB subSystemB = new SubSystemB();
    private SubSystemC subSystemC = new SubSystemC();

    public SubSystemA getSubSystemA() {
        return subSystemA;
    }

    public void setSubSystemA(SubSystemA subSystemA) {
        this.subSystemA = subSystemA;
    }

    public SubSystemB getSubSystemB() {
        return subSystemB;
    }

    public void setSubSystemB(SubSystemB subSystemB) {
        this.subSystemB = subSystemB;
    }

    public SubSystemC getSubSystemC() {
        return subSystemC;
    }

    public void setSubSystemC(SubSystemC subSystemC) {
        this.subSystemC = subSystemC;
    }

    public String wrapOptions() {
        return subSystemA.operateA() + subSystemB.operateB() +
                subSystemC.operateC();
    }
}
