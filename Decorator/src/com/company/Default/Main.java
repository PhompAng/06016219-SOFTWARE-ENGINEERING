package com.company.Default;

public class Main {

    public static void main(String[] args) {
        Beverage b1 = new Espresso();
        System.out.println(b1 + " $" + b1.cost());

        Beverage b2 = new Espresso();
        b2 = new Whip(b2);
        System.out.println(b2 + " $" + b2.cost());

        Beverage b3 = new DarkRoast();
        b3 = new Whip(new Whip(new Milk(b3)));
        System.out.println(b3 + " $" + b3.cost());
    }
}
