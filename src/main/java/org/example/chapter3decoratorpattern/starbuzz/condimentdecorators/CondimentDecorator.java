package org.example.chapter3decoratorpattern.starbuzz.condimentdecorators;

import org.example.chapter3decoratorpattern.starbuzz.component.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    public abstract String getDescription();

    public Size getSize() {
        return beverage.getSize();
    }
}