package org.example.chapter3decoratorpattern.starbuzz.concretecomponent;

import org.example.chapter3decoratorpattern.starbuzz.component.Beverage;

public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf Coffee";
    }

    public double cost() {
        return 1.05;
    }
}