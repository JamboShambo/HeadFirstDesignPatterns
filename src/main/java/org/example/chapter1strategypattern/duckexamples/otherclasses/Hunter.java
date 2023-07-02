package org.example.chapter1strategypattern.duckexamples.otherclasses;

import org.example.chapter1strategypattern.duckexamples.duckbehaviour.fly.FlyNoWay;
import org.example.chapter1strategypattern.duckexamples.duckbehaviour.quack.Quack;
import org.example.chapter1strategypattern.duckexamples.duckinterface.FlyBehavior;
import org.example.chapter1strategypattern.duckexamples.duckinterface.QuackBehavior;

public class Hunter {
    //    ----------CHALLENGE------------------
    //    A duck call is a device that hunters use to
    //    mimic the calls (quacks) of ducks. How
    //    would you implement your own duck call
    //    that does not inherit from the Duck class?

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public Hunter() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    public void performFly() {
        flyBehavior.fly();
    }
    public void performQuack() {
        quackBehavior.quack();
    }
    public void display() {
        System.out.println("I'm such a fake Duck");
    }


}