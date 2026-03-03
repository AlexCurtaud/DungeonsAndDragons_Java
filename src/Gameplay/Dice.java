package Gameplay;

public class Dice {
    private final int faces = 6;

    // Method
    // This Method gets a random number from the dice range
    public int getScore() {
        int range = (faces - 1) + 1;
        int score = (int) ((range * Math.random())+1);
        return score;
    }
}
