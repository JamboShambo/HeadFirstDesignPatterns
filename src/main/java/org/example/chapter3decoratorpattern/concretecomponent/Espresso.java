package org.example.chapter3decoratorpattern.concretecomponent;

import org.example.chapter3decoratorpattern.component.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }
}