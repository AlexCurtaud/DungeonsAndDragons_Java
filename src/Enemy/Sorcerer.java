package Enemy;

public class Sorcerer extends Enemy {
    private int magicPower = 2;
    private int health = 9;

    public Sorcerer(String name, int vitality, String type) {
        super(name, vitality, type);
    }

    //GETTER

    /**
     * Get Sorcerer Attack stat
     * @return
     */
    @Override
    public int getAttack() {
        return magicPower;
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
        return name + "\nType: " + type + "\nHealth [" + health + "] + PhysicalAttack [" + magicPower + "]";
    }
}
