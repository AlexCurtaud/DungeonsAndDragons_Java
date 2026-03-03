package Characters;

public class Wizard extends Character {
    private final int health = 6;
    private final int magicPower = 8;
    private String breed = "Characters.Wizard";

    // Characters.Wizard is extension of the Characters.Character Class. A Characters.Wizard is a type of Characters.Character.
    public Wizard(String characterName, int type) {
        // super is calling to the Characters.Character class when creating a Characters.Wizard. When we create a wizard, it creates a Characters.Character.
        super(characterName, type);
    }

    // GETTER
    // Get Health
    @Override
    public int getHealthStat() {
        return health;
    }

    // Get physical Attack
    @Override
    public int getAttackStat() {
        return magicPower;
    }

    // Get breed
    @Override
    public String getBreed() {
        return breed;
    }
}
