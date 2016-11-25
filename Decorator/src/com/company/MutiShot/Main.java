package com.company.MutiShot;

/**
 * Created by phompang on 11/25/2016 AD.
 */
public class Main {

    public static void main(String[] args) {
        Beverage cup1 = new Cup();
        System.out.println(cup1 + " $" + cup1.cost());

        Beverage cup2 = new Cup();
        cup2 = new Whip(new Espresso(cup2));
        System.out.println(cup2 + " $" + cup2.cost());

        Beverage cup3 = new Cup();
        cup3 = new Whip(new Whip(new DarkRoast(new Espresso(cup3))));
        System.out.println(cup3 + " $" + cup3.cost());
    }
}
