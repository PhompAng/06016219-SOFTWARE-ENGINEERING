package com.company.Default2;

/**
 * Created by phompang on 11/26/2016 AD.
 */
public abstract class Decorator implements Beverage {
    protected Beverage b;

    public Decorator(Beverage b) {
        this.b = b;
    }

    public String description() {
        return b.description();
    }

    public double cost() {
        return b.cost();
    }

}
