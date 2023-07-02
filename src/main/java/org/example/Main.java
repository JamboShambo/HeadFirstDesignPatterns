package org.example;

import org.example.ducks.Duck;
import org.example.ducks.MallardDuck;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello world!");

        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
    }
}