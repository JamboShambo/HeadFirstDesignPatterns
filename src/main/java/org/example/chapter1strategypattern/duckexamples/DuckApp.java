package org.example.chapter1strategypattern.duckexamples;

import org.example.chapter1strategypattern.duckexamples.duckbehaviour.fly.FlyRocketPowered;
import org.example.chapter1strategypattern.duckexamples.duckclasses.Duck;
import org.example.chapter1strategypattern.duckexamples.duckclasses.MallardDuck;
import org.example.chapter1strategypattern.duckexamples.duckclasses.ModelDuck;
import org.example.chapter1strategypattern.duckexamples.otherclasses.Hunter;

public class DuckApp {
        public static void main(String[] args) {
            System.out.println("---------------------");

            Duck mallard = new MallardDuck();
            mallard.display();
            mallard.performQuack();
            mallard.performFly();

            System.out.println("---------------------");

            Duck model = new ModelDuck();
            model.display();
            model.performFly();
            model.setFlyBehavior(new FlyRocketPowered());
            model.performFly();

            System.out.println("---------------------");
            Hunter hunter = new Hunter();
            hunter.display();
            hunter.performQuack();

        }
    }