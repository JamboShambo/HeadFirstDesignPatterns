package org.example.chapter1strategypattern.designpuzzleadventuregame.characterclasses;

import org.example.chapter1strategypattern.designpuzzleadventuregame.characterbehaviour.weapon.BowAndArrow;

public class Knight extends Character {
    public Knight() {
        weaponBehavior = new BowAndArrow();
    }
    public void fight() {
        System.out.println("I'm a Knight");
    }
}