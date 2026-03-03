package Characters;

public class Warrior extends Character {
    private final int health = 10;
    private final int physicalAttack = 5;
    private String breed = "Characters.Warrior";

    // Characters.Warrior is extension of the Characters.Character Class. A Characters.Warrior is a type of Characters.Character.
    public Warrior(String characterName, int type) {
        // super is calling to the Characters.Character class when creating a Characters.Warrior. When we create a Characters.Warrior, it creates a Characters.Character.
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
        return physicalAttack;
    }

    // Get breed
    @Override
    public String getBreed() {
        return breed;
    }
}