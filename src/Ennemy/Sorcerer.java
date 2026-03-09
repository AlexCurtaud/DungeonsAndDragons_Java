package Ennemy;

public class Sorcerer extends Ennemy {
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
        return return "Ennemy : \n" + name + " " + type + "\n" + "Health [" + health + "] + PhysicalAttack [" + magicPower + "]";
    }
}
