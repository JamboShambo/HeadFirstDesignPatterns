package org.example.chapter3decoratorpattern;

import org.example.chapter3decoratorpattern.component.Beverage;
import org.example.chapter3decoratorpattern.concretecomponent.DarkRoast;
import org.example.chapter3decoratorpattern.concretecomponent.Espresso;
import org.example.chapter3decoratorpattern.concretecomponent.HouseBlend;
import org.example.chapter3decoratorpattern.condimentdecorators.Mocha;
import org.example.chapter3decoratorpattern.condimentdecorators.Soy;
import org.example.chapter3decoratorpattern.condimentdecorators.Whip;

public class StarbuzzCoffee {

    public static void main(String args[]) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()
                + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription()
                + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription()
                + " $" + beverage3.cost());
    }
}
