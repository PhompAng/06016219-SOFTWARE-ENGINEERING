package com.company;

public class Main {

    public static void main(String[] args) {
	    PizzaCompany pizzaCompany = new PizzaCompany();
        Pizza hawaiian = pizzaCompany.orderPizza("P1", "Hawaiian");
        hawaiian.prepare();
        hawaiian.bake();
        hawaiian.cut();
        hawaiian.box();
        System.out.println(hawaiian);
        Pizza cheese = pizzaCompany.orderPizza("P2", "Cheese");
        cheese.prepare();
        cheese.bake();
        cheese.cut();
        cheese.box();
        System.out.println(cheese);
    }
}
