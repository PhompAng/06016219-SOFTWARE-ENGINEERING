package com.company.Default;

/**
 * Created by phompang on 11/25/2016 AD.
 */
public class Milk extends Decorator {

    Beverage b;

    public Milk(Beverage b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return b + ", Milk";
    }

    @Override
    public double cost() {
        return 0.1 + b.cost();
    }
}
