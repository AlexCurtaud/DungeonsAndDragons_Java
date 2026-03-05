package characters;

public class Warrior extends Character {
    private int health = 10;
    private int physicalAttack = 5;

    /**
     * Warrior is extension of the Character Class. A Warrior is a type of Character.
     * @param characterName
     * @param type
     */
    public Warrior(String characterName, String type) {
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
     * @return attack
     */
    @Override
    public int getAttackStat() {
        return physicalAttack;
    }

    /**
     * Gather the Warrior information
     * @return Object
     */
    @Override
    public String toString() {
        return "Player : \n" + name + " " + type + "\n" + "Health [" + health + "] + PhysicalAttack [" + physicalAttack + "]";
    }
}