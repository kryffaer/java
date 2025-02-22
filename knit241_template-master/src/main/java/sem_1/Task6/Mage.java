package sem_1.Task6;

public class Mage extends Player implements Cast {
    public Mage(String name) {
        setName(name);
        setHealth(100);
        setMaxHealth(100);
        setALive(true);
        setX(0);
        setY(15);
        setDamage(75);
        setDefence(25);
    }

    @Override
    protected void move(int newX, int newY) {
        setPosition(newX, newY);
        System.out.println(name + " переместился на позцию " + newX + " " + newY);
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
    public void cast(Player player) {
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
