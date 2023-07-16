package org.example.chapter1strategypattern.duckexamples.duckbehaviour.quack;

import org.example.chapter1strategypattern.duckexamples.duckinterface.QuackBehavior;

public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack");
    }
}
