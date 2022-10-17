package academy.mindswap.Modulo1.MonstersGame2.Supernatural.Strikeable.Monsters;

import academy.mindswap.Modulo1.MonstersGame2.Supernatural.SupernaturalTypes;

public class Werewolf extends Monster {

    public Werewolf(int hitPower) {
        super(hitPower);
        super.setType(SupernaturalTypes.WEREWOLF);
    }
}
