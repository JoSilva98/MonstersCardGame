package academy.mindswap.Modulo1.MonstersGame2.Supernatural;

public class Fairy extends Supernatural {
    
    @Override
    public int attack() {
        return super.attack();
    }

    public Fairy(int hitPower) {
        super(hitPower);
        super.setType(SupernaturalTypes.FAIRY);
    }
}
