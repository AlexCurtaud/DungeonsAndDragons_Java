package Characters;

import Gameplay.Dice;

public class Character {
    private final String name;
    private final int type;
    private int currentPosition = 1;

    public Character(String name, int type) {
        this.name = name;
        this.type = type;
    }

    // GETTER
    // Get the character's name
    public String getName() {
        return name;
    }

    // Get the characters' type
    public int getType() {
        return type;
    }

    // Get the character's position
    public int getCurrentPosition() {
        return currentPosition;
    }

    // Get stats from the character
    // Attack
    public int getAttackStat() {
        return 0;
    }
    // Defense
    public int getHealthStat() {
        return 0;
    }
    // Breed
    public String getBreed() {
        return "";
    }

    // Method
    // Character's move
    public void move(Dice dice) {
        currentPosition = dice.getScore();
    }

}
