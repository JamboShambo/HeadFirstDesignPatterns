package org.example;

import org.example.chapter1strategypattern.designpuzzleadventuregame.characterbehaviour.weapon.Axe;
import org.example.chapter1strategypattern.designpuzzleadventuregame.characterbehaviour.weapon.BowAndArrow;
import org.example.chapter1strategypattern.designpuzzleadventuregame.characterbehaviour.weapon.Knife;
import org.example.chapter1strategypattern.designpuzzleadventuregame.characterbehaviour.weapon.Sword;
import org.example.chapter1strategypattern.designpuzzleadventuregame.characterclasses.*;
import org.example.chapter1strategypattern.designpuzzleadventuregame.characterclasses.Character;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello world!");

//        System.out.println("---------------------");
//
//        Duck mallard = new MallardDuck();
//        mallard.display();
//        mallard.performQuack();
//        mallard.performFly();
//
//        System.out.println("---------------------");
//
//        Duck model = new ModelDuck();
//        model.display();
//        model.performFly();
//        model.setFlyBehavior(new FlyRocketPowered());
//        model.performFly();
//
//        System.out.println("---------------------");
//        Hunter hunter = new Hunter();
//        hunter.display();
//        hunter.performQuack();

        System.out.println("---------------------");
        System.out.println("---------------------");
        System.out.println("---------------------");
        System.out.println("---------------------");
        System.out.println("---------------------");

        Character king = new King();
        king.fight();
        king.performWeapon();
        king.setWeaponBehavior(new BowAndArrow());
        king.performWeapon();

        System.out.println("---------------------");

        Character queen = new Queen();
        queen.fight();
        queen.performWeapon();
        queen.setWeaponBehavior(new Axe());
        queen.performWeapon();

        System.out.println("---------------------");
        Character knight = new Knight();
        knight.fight();
        knight.performWeapon();
        knight.setWeaponBehavior(new Knife());
        knight.performWeapon();

        System.out.println("---------------------");
        Character troll = new Troll();
        troll.fight();
        troll.performWeapon();
        troll.setWeaponBehavior(new Sword());
        troll.performWeapon();

    }
}