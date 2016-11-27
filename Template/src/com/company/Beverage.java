package com.company;

/**
 * Created by phompang on 11/27/2016 AD.
 */
public abstract class Beverage {
    final void prepare() {
        boilWater();
        brew();
        pour();
        addCondiment();
    }

    void boilWater() {
        System.out.println("Boil Water");
    }
    abstract void brew();
    void pour() {
        System.out.println("Pour in cup");
    }
    abstract void addCondiment();
}
