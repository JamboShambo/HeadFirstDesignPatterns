package org.example.chapter3decoratorpattern.starbuzz.concretecomponent;

import org.example.chapter3decoratorpattern.starbuzz.component.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    public double cost() {
        return 1.0;
    }
}