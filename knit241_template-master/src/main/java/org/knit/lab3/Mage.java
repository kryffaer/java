package org.knit.lab3;

public class Mage extends Player {

    public Mage(String name){
        setName(name);
        int hp = 100;
        setHealth(hp);
    }
    @Override
    protected void increaseHealth(int value) {
        int hp = getHealth();
        hp = hp + value;
        setHealth(hp);
    }

    @Override
    protected void decreaseHealth(int value) {
        int hp = getHealth();
        hp = hp - value;
        setHealth(hp);
    }

    @Override
    protected void moveOver(int value) {
    }
}
