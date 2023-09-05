package org.example.chapter3decoratorpattern.condimentdecorators;

import org.example.chapter3decoratorpattern.component.Beverage;

public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {
        return .20 + beverage.cost();
    }
}