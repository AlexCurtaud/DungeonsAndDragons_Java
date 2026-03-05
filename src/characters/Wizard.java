package characters;

public class Wizard extends Character {
    private final int health = 6;
    private final int magicPower = 8;

    /**
     * Wizard is extension of the Character Class. A Wizard is a type of Character.
     * @param characterName
     * @param type
     */
    public Wizard(String characterName, String type) {
        super(characterName, type);
    }

    // GETTER
    /**
     * Get the HealthStat
     * @return health
     */
    @Override
    public int getHealthStat() {
        return health;
    }

    /**
     * Get the AttackStat
     * @return magicPower
     */
    @Override
    public int getAttackStat() {
        return magicPower;
    }

    /**
     * Gather the Wizard information
     * @return Object
     */
    @Override
    public String toString() {
        return "Player : \n" + name + " " + type + "\n" + "Health [" + health + "] MagicPower [" + magicPower + "]";
    }
}
