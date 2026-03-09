package Gameplay;

/**
 * Dice class, no constructor for now. It takes one attribute that is a number of faces.
 * Always 6 for now
 */
public class Dice {
    private final int faces = 1;

    // Method
    /**
     * This Method gets a random number from the dice range
     * @return a random within the dice range
     */
    public int getScore() {
        int range = (faces - 1) + 1;
        int score = (int) ((range * Math.random())+1);
        return score;
    }
}
