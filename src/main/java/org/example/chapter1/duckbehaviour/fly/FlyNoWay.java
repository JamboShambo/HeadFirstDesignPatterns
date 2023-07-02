package org.example.chapter1.duckbehaviour.fly;

import org.example.chapter1.duckinterface.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly");
    }
}