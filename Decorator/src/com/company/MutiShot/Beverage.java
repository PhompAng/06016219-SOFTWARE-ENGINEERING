package com.company.MutiShot;

/**
 * Created by phompang on 11/25/2016 AD.
 */
public abstract class Beverage {
    String description = "";

    public String toString() {
        return description;
    }

    public abstract double cost();
}
