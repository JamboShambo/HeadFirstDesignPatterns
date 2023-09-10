package org.example.chapter4factorypattern;

import org.example.chapter4factorypattern.pizzastore.ChicagoPizzaStore;
import org.example.chapter4factorypattern.pizzastore.NYPizzaStore;
import org.example.chapter4factorypattern.pizzastore.PizzaStore;
import org.example.chapter4factorypattern.pizzatype.Pizza;

public class RunPizza {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        System.out.println("_____________________________________");
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza + "\n");

        System.out.println("_____________________________________");
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza + "\n");

        System.out.println("_____________________________________");
        pizza = nyStore.orderPizza("veggie");
        System.out.println("Ethan ordered a " + pizza + "\n");

        System.out.println("_____________________________________");
        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("Joel ordered a " + pizza + "\n");
    }
}