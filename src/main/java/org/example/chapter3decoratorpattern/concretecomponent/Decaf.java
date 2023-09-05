package org.example.chapter3decoratorpattern.concretecomponent;

import org.example.chapter3decoratorpattern.component.Beverage;

public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf Coffee";
    }

    public double cost() {
        return 1.05;
    }
}