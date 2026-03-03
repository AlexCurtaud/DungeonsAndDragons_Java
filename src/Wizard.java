public class Wizard extends Character{
    private final int health = 6;
    private final int magicPower = 8;
    private final Gear gear = null;
    private String breed = "Wizard";

    // Wizard is extension of the Character Class. A Wizard is a type of Character.
    public Wizard(String characterName, int type) {
        // super is calling to the Character class when creating a Wizard. When we create a wizard, it creates a Character.
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
