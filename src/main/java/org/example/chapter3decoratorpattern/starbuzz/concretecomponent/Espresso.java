package org.example.chapter3decoratorpattern.starbuzz.concretecomponent;

import org.example.chapter3decoratorpattern.starbuzz.component.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }
}