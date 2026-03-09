package Enemy;

public class Dragon extends Enemy {
    private int physicalAttack = 4;
    private int health = 15;

    public Dragon(String name, int vitality, String type) {
        super(name, vitality, type);
    }

    //GETTER
    /**
     * Get Sorcerer Attack stat
     * @return
     */
    @Override
    public int getAttack() {
        return physicalAttack;
    }

    /**
     * Get Sorcerer Health Stats
     * @return
     */
    @Override
    public int getHealth() {
        return health;
    }

    public String toString() {
        return name + "\n Type: " + type + "\nHealth [" + health + "] + PhysicalAttack [" + physicalAttack + "]";
    }
}
