package academy.mindswap.Modulo1.MonstersGame2.Supernatural.Strikeable;

import academy.mindswap.Modulo1.MonstersGame2.Supernatural.Supernatural;
import academy.mindswap.Modulo1.MonstersGame2.Supernatural.SupernaturalTypes;

public class Witch extends Supernatural implements StrikeableI {

    private boolean dead;
    private static final int MIN_HEALTH = 0;

    public Witch(int hitPower) {
        super(hitPower);
        super.setType(SupernaturalTypes.WITCH);
    }

    public boolean isDead() {
        return dead;
    }

    @Override
    public void suffer(int hitPower) {
        this.setHealth(this.getHealth() - hitPower / 2);
        if (this.getHealth() <= MIN_HEALTH) {
            this.dead = false;
            this.setHealth(MIN_HEALTH);
        }
    }
}
