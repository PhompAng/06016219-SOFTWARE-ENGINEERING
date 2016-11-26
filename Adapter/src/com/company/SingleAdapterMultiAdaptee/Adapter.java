package com.company.SingleAdapterMultiAdaptee;

/**
 * Created by phompang on 11/26/2016 AD.
 */
public class Adapter<T extends Bird> implements Duck {
    private T adaptee;

    public Adapter(T adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void quack() {
        adaptee.jibjib();
    }

    @Override
    public void fly() {
        adaptee.fly();
    }
}
