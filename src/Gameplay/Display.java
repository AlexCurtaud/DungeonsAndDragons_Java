package Gameplay;

import Characters.Character;

public class Display {
    private final String ls;

    public Display() {
        ls = System.lineSeparator();
    }

    //Display Method
    public void statsDisplay(Character player) {
        System.out.println(
                player.getName() + " : " + player.getPlayerClass() + ls +
                "Health: " + player.getHealthStat() + ls +
                "Attack: " + player.getAttackStat());
    }
}