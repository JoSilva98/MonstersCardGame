package academy.mindswap.Modulo1.MonstersGame2.Supernatural;

public enum SupernaturalTypes {
    WEREWOLF("Werewolf"),
    VAMPIRE("Vampire"),
    MUMMY("Mummy"),
    FAIRY("Fairy"),
    WITCH("Witch");

    private final String NAME;

    SupernaturalTypes(String name) {
        this.NAME = name;
    }

    public String getNAME() {
        return NAME;
    }
}
