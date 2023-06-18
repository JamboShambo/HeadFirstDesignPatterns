package org.example.ducks;

public class DecoyDuck extends Duck{

    @Override
    public void quack() {
        System.out.println("DecoyDuck no sound");
    }

    @Override
    public void display() {
        System.out.println("DecoyDuck Display");
    }

    @Override
    public void fly() {
        System.out.println("DecoyDuck dont fly");
    }
}
