package com.company;

public class Main {

    public static void main(String[] args) {
	    PizzaCompany pizzaCompany = new PizzaCompany();
        Pizza hawaiian = pizzaCompany.orderPizza("P1", "Hawaiian");
        System.out.println(hawaiian);
        Pizza cheese = pizzaCompany.orderPizza("P2", "Cheese");
        System.out.println(cheese);
    }
}
