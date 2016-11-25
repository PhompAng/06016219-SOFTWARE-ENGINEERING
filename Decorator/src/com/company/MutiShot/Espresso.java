package com.company.MutiShot;

/**
 * Created by phompang on 11/25/2016 AD.
 */
public class Espresso extends Decorator {

    Beverage b;

    public Espresso(Beverage b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return b + ", Espresso";
    }

    @Override
    public double cost() {
        return 1.99 + b.cost();
    }
}
