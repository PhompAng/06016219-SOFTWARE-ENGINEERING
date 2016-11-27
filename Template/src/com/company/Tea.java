package com.company;

/**
 * Created by phompang on 11/27/2016 AD.
 */
public class Tea extends Beverage {
    @Override
    void brew() {
        System.out.println("Brew tea");
    }

    @Override
    void addCondiment() {
        System.out.println("Add Lemon");
    }
}
