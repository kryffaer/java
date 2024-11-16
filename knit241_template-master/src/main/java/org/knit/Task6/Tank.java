package org.knit.Task6;

public class Tank extends Warrior {
    public int additionalDefence = 15;

    public Tank(String name) {
        super(name);
    }

    @Override
    protected void decreaseHealth(int value) {
        int hp = getHealth() + getDefence() + additionalDefence - value;
        if (hp <= 0) {
            setALive(false);
            setHealth(0);
        } else {
            setHealth(hp);
        }
    }
}
