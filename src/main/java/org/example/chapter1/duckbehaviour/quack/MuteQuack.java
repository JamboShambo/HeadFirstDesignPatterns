package org.example.chapter1.duckbehaviour.quack;

import org.example.chapter1.duckinterface.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}