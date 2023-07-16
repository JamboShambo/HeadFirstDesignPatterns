package org.example.chapter1strategypattern.duckexamples.duckclasses;

import org.example.chapter1strategypattern.duckexamples.duckbehaviour.fly.FlyNoWay;
import org.example.chapter1strategypattern.duckexamples.duckbehaviour.quack.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    public void display() {
        System.out.println("I'm a model duck");
    }
}