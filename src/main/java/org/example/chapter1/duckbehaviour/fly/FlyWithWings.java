package org.example.chapter1.duckbehaviour.fly;

import org.example.chapter1.duckinterface.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
