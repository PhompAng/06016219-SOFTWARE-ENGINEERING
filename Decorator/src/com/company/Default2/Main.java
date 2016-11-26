package com.company.Default2;

/**
 * Created by phompang on 11/26/2016 AD.
 */
public class Main {
    public static void main(String[] args) {
        Beverage b1 = new Espresso();
        System.out.println(b1.description() + " $" + b1.cost());

        Beverage b2 = new Espresso();
        b2 = new Whip(b2);
        System.out.println(b2.description() + " $" + b2.cost());

        Beverage b3 = new DarkRoast();
        b3 = new Whip(new Whip(new Milk(b3)));
        System.out.println(b3.description() + " $" + b3.cost());
    }
}
