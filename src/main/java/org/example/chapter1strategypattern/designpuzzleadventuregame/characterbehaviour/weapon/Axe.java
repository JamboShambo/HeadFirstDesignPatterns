package org.example.chapter1strategypattern.designpuzzleadventuregame.characterbehaviour.weapon;

import org.example.chapter1strategypattern.designpuzzleadventuregame.characterinterface.WeaponBehavior;

public class Axe implements WeaponBehavior {
    public void useWeapon() {
        System.out.println("Axe slash");
    }
}