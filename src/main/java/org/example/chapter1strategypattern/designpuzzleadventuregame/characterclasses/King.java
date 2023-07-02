package org.example.chapter1strategypattern.designpuzzleadventuregame.characterclasses;

import org.example.chapter1strategypattern.designpuzzleadventuregame.characterbehaviour.weapon.Sword;

public class King extends Character {
    public King() {
        weaponBehavior = new Sword();
    }
    public void fight() {
        System.out.println("I'm a King");
    }
}