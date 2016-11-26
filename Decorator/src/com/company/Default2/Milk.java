package com.company.Default2;

/**
 * Created by phompang on 11/26/2016 AD.
 */
public class Milk extends Decorator {
    public Milk(Beverage b) {
        super(b);
    }

    @Override
    public String description() {
        return super.description() + ", Milk";
    }

    @Override
    public double cost() {
        return super.cost() + 0.1;
    }
}
