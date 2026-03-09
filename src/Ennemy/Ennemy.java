package Ennemy;

public abstract class Ennemy {
    protected String name;
    protected int vitality;
    protected String type;

    /**
     * The Ennemy class is made out of three attributes:
     * name, vitality and type attributes
     * Subclasses will inherit this abstract class to create more specific ennemies.
     * @param name
     * @param vitality
     * @param type
     */
    public Ennemy(String name, int vitality, String type) {
        this.name = name;
        this.vitality = vitality;
        this.type = type;
    }

    //GETTER

    /**
     * Get Ennemy's name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Get Ennemy's vitality
     * @return vitality
     */
    public int getVitality() {
        return vitality;
    }

    /**
     * Get Attack - Abstract because the attack stat is stacked within the sub class
     */
    public abstract int getAttack();

    /**
     * Get Attack - Abstract because the attack stat is stacked within the sub class
     */
    public abstract int getHealth();

    public abstract String toString();
}
