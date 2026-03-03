package Gameplay;

import Characters.Character;

public class Display {
    private final String ls;

    public Display() {
        ls = System.lineSeparator();
    }

    // Gameplay.Display Method
    public void messageDisplay(String message) {
        System.out.println(message);
    }

    public void statusDisplay(Character character) {
        System.out.println(
                character.getName() + " : " + character.getBreed() + ls +
                "Health: " + character.getHealthStat() + ls +
                "Attack: " + character.getAttackStat());
    }
}