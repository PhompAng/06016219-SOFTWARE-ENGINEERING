package com.company.Default2;

/**
 * Created by phompang on 11/26/2016 AD.
 */
public class Espresso implements Beverage {
    @Override
    public String description() {
        return "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
