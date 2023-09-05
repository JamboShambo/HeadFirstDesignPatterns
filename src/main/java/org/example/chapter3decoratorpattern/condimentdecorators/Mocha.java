package org.example.chapter3decoratorpattern.condimentdecorators;

import org.example.chapter3decoratorpattern.component.Beverage;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        return .30 + beverage.cost();
    }
}