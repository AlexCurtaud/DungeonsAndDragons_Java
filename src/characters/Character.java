package characters;

import Gameplay.Dice;

public abstract class Character {
    protected String name;
    protected String type;
    private int currentPosition = 1;

    /**
     * Character is an abstract Class containing 2 parameters that are passed to its subclasses
     * Name because any character has a name
     * Type because any character has a type
     * @param name
     * @param type
     */
    public Character(String name, String type) {
        this.name = name;
        this.type = type;
    }

    // GETTER
    /**
     * Get Character's name
      * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Get Character's type
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * Get Character's currentPosition
     * @return currentPosition
     */
    public int getCurrentPosition() {
        return currentPosition;
    }

    // Get stats from the character
    /**
     * Get Character's Attack statistic
     * @return AttackStat
     */
    public abstract int getAttackStat();

    /**
     * Get Character's Health statistic
     * @return HealthStat
     */
    public abstract int getHealthStat();

    // SETTER
    /**
     * Set Character's currentPosition
     * @return currentPosition
     */
    public void setCurrentPosition(int i){
        currentPosition = i;
    }

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
