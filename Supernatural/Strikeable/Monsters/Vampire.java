package academy.mindswap.Modulo1.MonstersGame2.Supernatural.Strikeable.Monsters;

import academy.mindswap.Modulo1.MonstersGame2.Helpers;
import academy.mindswap.Modulo1.MonstersGame2.Supernatural.SupernaturalTypes;

public class Vampire extends Monster {

    private static final int BITE_PROBABILITY = 2;
    private static final int HEALING_VALUE = 10;

    public Vampire(int hitPower) {
        super(hitPower);
        super.setType(SupernaturalTypes.VAMPIRE);
    }

    @Override
    public int attack() {
        int generatedNr = Helpers.generateRandomNr(10, 0);
        if (generatedNr < BITE_PROBABILITY) {
            this.increaseHealth(HEALING_VALUE);
            System.out.println("Vampire hits his bite and heals 10% life points. Current health: " + this.getHealth() + "%");
        }
        return super.attack();
    }
}
