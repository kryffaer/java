package sem_1.Task6;

public class Priest extends Player implements Heal {
    public Priest(String name) {
        setName(name);
        setHealth(100);
        setMaxHealth(100);
        setALive(true);
        setX(0);
        setY(20);
        setDamage(50);
        setDefence(0);
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
    public void heal(Player player) {
        if (isALive()) {
            player.increaseHealth(getDamage());
            System.out.println(name + " лечит " + player.getName() + " на " + player.getDamage() + "hp до " + player.getHealth() + "hp");
            if (!player.isALive()) {
                System.out.println(player.getName() + " помер");
            }
        } else {
            System.out.println(name + " мёртв");
        }

    }
}
