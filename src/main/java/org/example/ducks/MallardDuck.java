package org.example.ducks;

import org.example.chapter1.duckbehaviour.fly.FlyWithWings;
import org.example.chapter1.duckbehaviour.quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}