public class Warrior extends Character{
    private final int health = 10;
    private final int physicalAttack = 5;
    private String breed = "Warrior";

    // Warrior is extension of the Character Class. A Warrior is a type of Character.
    public Warrior(String characterName, int type) {
        // super is calling to the Character class when creating a Warrior. When we create a Warrior, it creates a Character.
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