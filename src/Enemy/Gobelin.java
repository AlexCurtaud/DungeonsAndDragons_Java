package Enemy;

public class Gobelin extends Enemy {
    private int physicalAttack = 2;
    private int health = 9;


    public Gobelin(String name, int vitality, String type) {
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
        return name + "\nType: " + type + "\nHealth [" + health + "] + PhysicalAttack [" + physicalAttack + "]";
    }
}
