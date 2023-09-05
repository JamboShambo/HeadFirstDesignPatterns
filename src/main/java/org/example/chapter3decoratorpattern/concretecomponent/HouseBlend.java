package org.example.chapter3decoratorpattern.concretecomponent;

import org.example.chapter3decoratorpattern.component.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    public double cost() {
        return 1.0;
    }
}