package org.example.chapter3decoratorpattern.coffeeclasses;

public abstract class Beverage {
    String description = "Tasty Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}