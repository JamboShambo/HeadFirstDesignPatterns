package org.example.chapter3decoratorpattern.concretecomponent;

import org.example.chapter3decoratorpattern.component.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    public double cost() {
        return 1.0;
    }
}