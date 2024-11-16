package org.knit.Task6;

public class Warrior extends Player implements Attack {
    public Warrior(String name) {
        setName(name);
        setHealth(200);
        setMaxHealth(200);
        setALive(true);
        setX(0);
        setY(10);
        setDamage(50);
        setDefence(50);
    }

    @Override
    protected void move(int newX, int newY) {
        setPosition(newX, newY);
    }

    @Override
    protected void increaseHealth(int value) {
        if (getHealth() + value > getMaxHealth()) {
            setHealth(getMaxHealth());
        } else if (getHealth() > 0) {
            setHealth(getHealth() + value);
        }
    }

    @Override
    protected void decreaseHealth(int value) {
        int hp = getHealth() + getDefence() - value;
        if (hp <= 0) {
            setALive(false);
            setHealth(0);
        } else {
            setHealth(hp);
        }
    }

    @Override
    public void attack(Player player) {
        if (isALive()) {
            player.decreaseHealth(getDamage());
            System.out.println(name + " наносит " + player.getName() + " урон в " + player.getDamage() + "hp и оставляет " + player.getHealth() + "hp");
            if (!player.isALive()) {
                System.out.println(player.getName() + " помер");
            }
        } else {
            System.out.println(name + " мёртв");
        }
    }
}
