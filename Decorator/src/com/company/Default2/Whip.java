package com.company.Default2;

/**
 * Created by phompang on 11/26/2016 AD.
 */
public class Whip extends Decorator {
    public Whip(Beverage b) {
        super(b);
    }

    @Override
    public String description() {
        return super.description() + ", Whip";
    }

    @Override
    public double cost() {
        return super.cost() + 0.1;
    }
}
