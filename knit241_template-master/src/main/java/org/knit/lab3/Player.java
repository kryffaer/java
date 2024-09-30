package org.knit.lab3;

abstract public class Player {
    private String name;
    private int health;
    private int maxHealth;
    private boolean isAlife; //статус
    private int x;
    private int y;
    private int damage; //урон
    private int defence; //защита

    protected abstract void increaseHealth(int value);

    protected abstract void decreaseHealth(int value);

    protected abstract void moveOver(int value); //подвинуться на позицию

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public boolean isAlife() {
        return isAlife;
    }

    public void setAlife(boolean alife) {
        isAlife = alife;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }
}