package academy.mindswap.Modulo1.MonstersGame2.Supernatural.Strikeable.Monsters;

import academy.mindswap.Modulo1.MonstersGame2.Supernatural.SupernaturalTypes;

public class Mummy extends Monster {

    private static final int COUNTER_START = 0;
    private static final int COUNTER_LIMIT = 3;
    private static final int SELF_DAMAGE = 10;
    private int counter = COUNTER_START;

    public Mummy(int hitPower) {
        super(hitPower);
        super.setType(SupernaturalTypes.MUMMY);
    }

    @Override
    public int attack() {
        this.counter++;

        if (this.counter == COUNTER_LIMIT) {
            System.out.println("Mummy unrolled and lost 10 life points.");
            this.suffer(SELF_DAMAGE);
        }
        return super.attack();
    }

    @Override
    public void suffer(int hitPower) {
        this.counter = COUNTER_START;
        super.suffer(hitPower);
    }
}
