package com.company.Default2;

/**
 * Created by phompang on 11/26/2016 AD.
 */
public class DarkRoast implements Beverage {
    @Override
    public String description() {
        return "Dark Roast";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
