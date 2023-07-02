package org.example.chapter1strategypattern.designpuzzleadventuregame.characterclasses;

import org.example.chapter1strategypattern.designpuzzleadventuregame.characterbehaviour.weapon.Axe;

public class Troll extends Character {
    public Troll() {
        weaponBehavior = new Axe();
    }
    public void display() {
        System.out.println("I'm a Troll");
    }
}