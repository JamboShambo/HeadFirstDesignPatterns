package org.example.chapter1strategypattern.designpuzzleadventuregame.characterclasses;

import org.example.chapter1strategypattern.designpuzzleadventuregame.characterbehaviour.weapon.Knife;

public class Queen extends Character {
    public Queen() {
        weaponBehavior = new Knife();
    }
    public void display() {
        System.out.println("I'm a Queen");
    }
}