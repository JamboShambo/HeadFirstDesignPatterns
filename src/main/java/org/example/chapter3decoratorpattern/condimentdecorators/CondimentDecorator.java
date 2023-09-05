package org.example.chapter3decoratorpattern.condimentdecorators;

import org.example.chapter3decoratorpattern.component.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    public abstract String getDescription();
}