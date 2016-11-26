package com.company;

/**
 * Created by phompang on 11/26/2016 AD.
 */
public class HawaiianPizza extends Pizza {
    public HawaiianPizza(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Hawaiian";
    }

    @Override
    public void prepare() {
        System.out.println("Preparing (Hawiian) " + this.name);
    }
}
