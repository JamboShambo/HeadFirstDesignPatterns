package org.example.chapter1strategypattern.duckexamples.duckclasses;

import org.example.chapter1strategypattern.duckexamples.duckbehaviour.fly.FlyWithWings;
import org.example.chapter1strategypattern.duckexamples.duckbehaviour.quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}