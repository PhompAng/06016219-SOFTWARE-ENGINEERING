package com.company;

/**
 * Created by phompang on 11/26/2016 AD.
 */
public class PizzaCompany {
    public Pizza orderPizza(String name, String type) {
        Pizza p = null;
        switch (type) {
            case "Hawaiian":
                p = new HawaiianPizza(name);
                break;
            case "Cheese":
                p = new CheesePizza(name);
                break;
        }
        return p;
    }
}
