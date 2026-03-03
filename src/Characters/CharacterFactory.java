package Characters;

import Gameplay.Display;

public class CharacterFactory {
    public static Character characterCreator(String name, int type) {
        Display display = new Display();
        Characters.Character character;
        if(type == 1) {
            character = new Wizard(name, type);
            display.messageDisplay("Player " + name + ", join the wizard guild");
        } else {
            character = new Warrior(name, type);
            display.messageDisplay("Player " + name + ", join the warrior guild");
        }
        return character;
    }
}
