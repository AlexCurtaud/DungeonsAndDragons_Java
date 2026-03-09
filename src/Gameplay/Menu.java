package Gameplay;

import Characters.Character;
import java.util.Scanner;
import Enum.PlayerClass;
import Exception.PlayerTypeInvalidException;

/**
 * A game always display a menu for the user to interact and get message from the game. It's the role of this class.
 */
public class Menu {
    private final Scanner clavier;
    private final String ls;
    private Game game;

    /**
     * Menu Constructor initiates a Menu that uses three attributes
     * Scanner with System.in to retrieve user input
     * System.lineSeparator to simplify the print in the console
     * Game to use its method within the menu
     * @param game
     */
    public Menu(Game game) {
        this.clavier = new Scanner(System.in);
        this.ls = System.lineSeparator();
        this.game = game;
    }

    // Method

    /**
     * The main menu to:
     * - Start a game
     * - Create/Modify a Character
     * - Display Character info
     * - Exit the game
     */
    public void preGameMenu() {
        System.out.println("--WELCOME TO DUNGEONS AND DRAGONS--" + ls + " ---------- ");
        int userChoice;
        Character player = null;
        boolean end = false;
        while (!end) {
            System.out.println("[MENU]" + ls +
                    "1. New Game" + ls +
                    "2. Create/Update Character" + ls +
                    "3. Show Character's info" + ls +
                    "4. Exit");
            // Integer.parseInt + nextLine plutôt que nextInt. nextInt ne consomme pas le \n créé quand on fait entrée. Il faut donc le consommer ou traduire un string en int, car nextLine consomme le \n
            userChoice = Integer.parseInt(clavier.nextLine());
            switch (userChoice) {
                case 1:
                    game.startGame();
                    break;
                case 2:
                    try {
                        player = game.playerCreation();
                    } catch (PlayerTypeInvalidException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    if (player != null) {
                        System.out.println(player);
                    } else {
                        System.out.println("|||Please create a character|||");
                    }
                    break;
                case 4:
                    end = true;
                    break;
            }
        }
    }

    /**
     * A menu at the end of a game to chose between:
     * - Playing again
     * - Back to main menu
     * @return userChoice
     */
    public int endGameMenu() {
        System.out.println("1. Start New Game" + ls +
                "2. Main Menu");
        int userChoice = Integer.parseInt(clavier.nextLine());
        return userChoice;
    }

    // Retrieve User Information

    /**
     * Retrieve the name of the character out of a user input
     * @return characterName
     */
    public String retrieveName() {
        System.out.println("Welcome new adventurer! How should we call you ?");
        String characterName = clavier.nextLine();
        return characterName;
    }

    /**
     * Retrieve the character choice out of a user input
     * Two exceptions are used for this method in order for the player to be valid!
     *
     * @return type
     */
    // Retrieve the character choice of the user
    public String retrieveCharacterChoice() throws NumberFormatException, ArrayIndexOutOfBoundsException {
        String[] classType = {PlayerClass.WIZARD.getName(), PlayerClass.WARRIOR.getName()};
        String type;
        // Hero DAO to display
        System.out.println("Are you a :" + ls + "1. Wizard" + ls + "Stats: Magic Power 8 / Health: 6" + ls + "2. Warrior" + ls + "Stats: Physical Attack 5 / Health 10" + ls + "Type 1 or 2");
        int characterChoice = Integer.parseInt(clavier.nextLine());
        type = classType[characterChoice-1];
        return type;
    }


}
