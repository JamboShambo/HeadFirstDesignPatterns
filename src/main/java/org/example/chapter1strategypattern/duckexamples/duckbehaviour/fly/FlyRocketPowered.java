package org.example.chapter1strategypattern.duckexamples.duckbehaviour.fly;

import org.example.chapter1strategypattern.duckexamples.duckinterface.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}