package org.example.chapter1strategypattern.duckexamples.duckbehaviour.quack;

import org.example.chapter1strategypattern.duckexamples.duckinterface.QuackBehavior;

public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak");
    }
}
