package academy.mindswap.Modulo1.MonstersGame2;

import academy.mindswap.Modulo1.MonstersGame2.Supernatural.Strikeable.Monsters.*;
import academy.mindswap.Modulo1.MonstersGame2.Supernatural.SupernaturalTypes;

public class Player {

    private final String NAME;
    private Monster[] monsters;

    public Player(String name) {
        this.NAME = name;
    }

    public Monster generateMonsters() {
        SupernaturalTypes[] monsterType = SupernaturalTypes.values();

        int randomIndex = Helpers.generateRandomNr(3, 0);

        return switch (monsterType[randomIndex]) {
            case WEREWOLF -> new Werewolf(30);
            case VAMPIRE -> new Vampire(20);
            default -> new Mummy(10);
        };
    }

    public Monster chooseMonster() {
        int generatedNr = Helpers.generateRandomNr(this.monsters.length, 0);

        while (!this.monsters[generatedNr].isAlive()) {
            generatedNr = Helpers.generateRandomNr(this.monsters.length, 0);
        }
        return this.monsters[generatedNr];
    }

    public void setMonsters(int nrOfMonsters) {
        this.monsters = new Monster[nrOfMonsters];

        for (int i = 0; i < this.monsters.length; i++) {
            this.monsters[i] = generateMonsters();
        }
    }

    public boolean isAlive() { //
        for (Monster mon : monsters) {
            if (mon.isAlive()) {
                return true;
            }
        }
        return false;
    }

    public Monster[] getMonstersArray() {
        return monsters;
    }

    public Monster getMonster(int i) {
        return monsters[i];
    }

    public String getNAME() {
        return NAME;
    }
}
