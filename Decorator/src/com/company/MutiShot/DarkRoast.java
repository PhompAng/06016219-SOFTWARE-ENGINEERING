package com.company.MutiShot;

/**
 * Created by phompang on 11/25/2016 AD.
 */
public class DarkRoast extends Decorator {

    Beverage b;

    public DarkRoast(Beverage b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return b + ", Dark Roast";
    }

    @Override
    public double cost() {
        return 0.99 + b.cost();
    }
}
