package academy.mindswap.Modulo1.MonstersGame2.Supernatural.Strikeable.Monsters;

import academy.mindswap.Modulo1.MonstersGame2.Supernatural.Strikeable.StrikeableI;
import academy.mindswap.Modulo1.MonstersGame2.Supernatural.Supernatural;

public abstract class Monster extends Supernatural implements StrikeableI {

    private boolean alive = true;
    private static final int MIN_HEALTH = 0;

    public Monster(int hitPower) {
        super(hitPower);
    }

    public boolean isAlive() {
        return alive;
    }

    @Override
    public void suffer(int hitPower) {
        this.setHealth(this.getHealth() - hitPower);
        if (this.getHealth() <= MIN_HEALTH) {
            this.alive = false;
            this.setHealth(MIN_HEALTH);
        }
    }
}
