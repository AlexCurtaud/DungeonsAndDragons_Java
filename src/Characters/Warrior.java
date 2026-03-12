package Characters;

public class Warrior extends Character {
    private int health = 10;
    private int physicalAttack = 5;

    /**
     * WARRIOR is extension of the Character Class. A WARRIOR is a type of Character.
     * @param characterName
     * @param type
     * @param vitality
     */
    public Warrior(String characterName, String type, int vitality) {
        super(characterName, type, vitality);
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
     * Set Character's Health
     */
    @Override
    public void setHealthStat(){

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
     * Set Character's Attack
     */
    @Override
    public void setAttackStat(){

    }

    /**
     * Gather the WARRIOR information
     * @return Object
     */
    @Override
    public String toString() {
        return getId() + ". " + name + " - " + type + "\n" + "Health [" + health + "] + PhysicalAttack [" + physicalAttack + "]\n";
    }
}