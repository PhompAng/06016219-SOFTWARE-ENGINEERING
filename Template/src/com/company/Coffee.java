package com.company;

/**
 * Created by phompang on 11/27/2016 AD.
 */
public class Coffee extends Beverage {
    @Override
    void brew() {
        System.out.println("Brew Coffee");
    }

    @Override
    void addCondiment() {
        System.out.println("Add Milk");
    }
}
