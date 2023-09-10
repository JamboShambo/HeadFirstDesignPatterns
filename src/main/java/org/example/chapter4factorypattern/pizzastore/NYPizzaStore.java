package org.example.chapter4factorypattern.pizzastore;

import org.example.chapter4factorypattern.ingredients.NYPizzaIngredientFactory;
import org.example.chapter4factorypattern.ingredients.PizzaIngredientFactory;
//import org.example.chapter4factorypattern.pizzatype.NYCheesePizza;
//import org.example.chapter4factorypattern.pizzatype.NYVeggiePizza;
import org.example.chapter4factorypattern.pizzatype.CheesePizza;
import org.example.chapter4factorypattern.pizzatype.Pizza;
import org.example.chapter4factorypattern.pizzatype.VeggiePizza;

public class NYPizzaStore extends PizzaStore {

    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory =
                new NYPizzaIngredientFactory();
        if (item.equals("cheese")) {

            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");

        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        }
        return pizza;
    }
}