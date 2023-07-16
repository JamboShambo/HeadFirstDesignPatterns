package org.example.chapter1strategypattern.duckexamples.duckbehaviour.quack;

import org.example.chapter1strategypattern.duckexamples.duckinterface.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}