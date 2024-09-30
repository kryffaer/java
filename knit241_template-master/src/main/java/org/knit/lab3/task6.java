package org.knit.lab3;

public class task6 {
    public static void main(String[] args) {
        Mage mage = new Mage("asya");
        System.out.println(mage.getName());
        System.out.println(mage.getHealth());
        mage.increaseHealth(70);
        System.out.println(mage.getHealth());
    }
}
