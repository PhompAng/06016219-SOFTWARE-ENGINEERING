package com.company;

/**
 * Created by phompang on 11/26/2016 AD.
 */
public abstract class Pizza {
    protected String name;
    public Pizza(String name) {
        this.name = name;
    }
    public void prepare() {
        System.out.println("Preparing " + this.name);
    }
    public void bake() {
        System.out.println("Baking " + this.name);
    }
    public void cut() {
        System.out.println("Cutting " + this.name);
    }
    public void box() {
        System.out.println("Boxing " + this.name);
    }

    public String toString() {
        return this.name;
    }
}
