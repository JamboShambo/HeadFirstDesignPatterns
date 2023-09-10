package org.example.chapter4factorypattern.pizzastore;

import org.example.chapter4factorypattern.ingredients.ChicagoPizzaIngredientFactory;
import org.example.chapter4factorypattern.ingredients.PizzaIngredientFactory;
//import org.example.chapter4factorypattern.pizzatype.ChicagoStyleCheesePizza;
//import org.example.chapter4factorypattern.pizzatype.ChicagoStyleVeggiePizza;
import org.example.chapter4factorypattern.pizzatype.CheesePizza;
import org.example.chapter4factorypattern.pizzatype.Pizza;
import org.example.chapter4factorypattern.pizzatype.VeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory =
                new ChicagoPizzaIngredientFactory();
        if (item.equals("cheese")) {

            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");

        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");
        }
        return pizza;
    }
}