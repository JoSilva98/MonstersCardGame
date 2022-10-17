package academy.mindswap.Modulo1.MonstersGame2.Supernatural;

public abstract class Supernatural {

    private final int HIT_POWER;
    private static final int MAX_HEALTH = 100;
    private int health;
    private SupernaturalTypes type;

    public Supernatural(int hitPower) {
        this.HIT_POWER = hitPower;
        this.health = 100;
    }

    public int attack() {
        return HIT_POWER;
    }

    public int getHIT_POWER() {
        return HIT_POWER;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void increaseHealth(int increase) {
        if (this.health + increase > MAX_HEALTH) {
            this.health = MAX_HEALTH;
        } else {
            this.health -= increase;
        }
    }

    public SupernaturalTypes getType() {
        return type;
    }

    public void setType(SupernaturalTypes type) {
        this.type = type;
    }
}
