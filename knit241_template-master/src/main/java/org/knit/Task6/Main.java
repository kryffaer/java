package org.knit.Task6;

public class Main {
    public static void main(String[] args) {
        Mage mage = new Mage("Mage");
        Warrior warrior = new Warrior("Warrior");
        Priest priest = new Priest("Priest");
        Tank tank = new Tank("Tank");

        mage.cast(warrior);
        mage.cast(priest);
        mage.move(222,555);
        System.out.println();

        priest.heal(mage);
        warrior.attack(mage);
        warrior.attack(priest);
        System.out.println();

        priest.heal(warrior);
        tank.attack(mage);
    }
}
