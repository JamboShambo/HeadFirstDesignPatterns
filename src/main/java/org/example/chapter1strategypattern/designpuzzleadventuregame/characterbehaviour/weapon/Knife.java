package org.example.chapter1strategypattern.designpuzzleadventuregame.characterbehaviour.weapon;

import org.example.chapter1strategypattern.designpuzzleadventuregame.characterinterface.WeaponBehavior;

public class Knife implements WeaponBehavior {
    public void useWeapon() {
        System.out.println("Knife cut");
    }
}