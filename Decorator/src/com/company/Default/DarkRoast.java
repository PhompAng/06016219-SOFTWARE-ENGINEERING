package com.company.Default;

/**
 * Created by phompang on 11/25/2016 AD.
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
