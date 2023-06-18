package org.example.ducks;

public class RubberDuck extends Duck{

    @Override
    public void quack() {
        System.out.println("RubberDuck squeak");
    }

    @Override
    public void display() {
        System.out.println("RubberDuck Display");
    }

    @Override
    public void fly() {
        System.out.println("RubberDuck dont fly");
    }
}
