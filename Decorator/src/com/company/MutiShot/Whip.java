package com.company.MutiShot;

/**
 * Created by phompang on 11/25/2016 AD.
 */
public class Whip extends Decorator {

    Beverage b;

    public Whip(Beverage b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return b + ", Whip";
    }

    @Override
    public double cost() {
        return 0.1 + b.cost();
    }
}
