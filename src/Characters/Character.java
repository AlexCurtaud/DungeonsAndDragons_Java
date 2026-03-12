package Characters;

import DB.DatabaseConnection;
import DefensiveEquipment.DefensiveEquipment;
import Gameplay.Dice;
import OffensiveEquipment.OffensiveEquipment;

public abstract class Character {
    protected int id;
    protected String name;
    protected String type;
    private int currentPosition = 1;
    private int vitality;
    private OffensiveEquipment OffEquip = null;
    private DefensiveEquipment DefEquip = null;

    /**
     * Character is an abstract Class containing 2 parameters that are passed to its subclasses
     * Name because any character has a name
     * Type because any character has a type
     * A Parameter of vitality is present on the character. Vitality is the irremovable stat of life. It cannot move, that is equivalent to the max life point
     * It has as well a current Position on the board. For now it always start at the first position
     * A character can be equipped with Offensive and Defensive Equipment that are by default null
     * @param name
     * @param type
     * @param vitality
     */

    public Character(String name, String type, int vitality) {
        this.name = name;
        this.type = type;
        this.vitality = vitality;
    }

    // GETTER

    /**
     * Get the Player's id
     * @return id
     */
    public int getId() {
        return id;
    }
    /**
     * Set the player's id
     * @param id (from the database result);
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Get Character's name
      * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get Character's type
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * Get Character's vitality
     * @return vitality
     */
    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    /**
     * Get Character's currentPosition
     * @return currentPosition
     */
    public int getCurrentPosition() {
        return currentPosition;
    }

    /**
     * Set Character's currentPosition
     */
    public void setCurrentPosition(int i){
        currentPosition = i;
    }

    /**
     * Get Character's Attack statistic
     * @return AttackStat
     */
    public abstract int getAttackStat();
    /**
     * Set Character's Attack
     */
    public abstract void setAttackStat();

    /**
     * Get Character's Health statistic
     * @return HealthStat
     */
    public abstract int getHealthStat();
    /**
     * Set Character's Health
     */
    public abstract void setHealthStat();

    // SETTER

    //toString
    /**
     * Abstract Method in order to display sub Class object.
     */
    public abstract String toString();

    // Method
    /**
     * Movement method made for the character to move from as many cell as the Dice getScore method
     * @param dice
     */
    public void move(Dice dice) {
        currentPosition += dice.getScore();
    }
}
