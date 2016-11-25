package com.company.Default;

/**
 * Created by phompang on 11/25/2016 AD.
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
