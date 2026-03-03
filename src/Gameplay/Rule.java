package Gameplay;

public class Rule extends Game {
    private int victory = 47;
    private int defeat = 0;

    public Rule() {

    }

    // GETTER
    // Get the Winning condition
    public int getVictory() {
        return victory;
    }

    // Get the defeat condition
    public int getDefeat() {
        return defeat;
    }
}
