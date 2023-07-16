package org.example.chapter1strategypattern.designpuzzleadventuregame.characterclasses;

import org.example.chapter1strategypattern.designpuzzleadventuregame.characterinterface.WeaponBehavior;

public abstract class Character {

    WeaponBehavior weaponBehavior;
    public Character() { }
    public void performWeapon() {
        weaponBehavior.useWeapon();
    }

    public void setWeaponBehavior(WeaponBehavior wb) {
        System.out.println("Weapon upgrade");
        weaponBehavior = wb;
    }

    public void fight() {
        System.out.println("I'm a Character");
    }

}