package Gameplay;

import Characters.Character;
import Characters.CharacterFactory;

import java.util.Scanner;

public class Menu {
    // The class Scanner has many useful tools like the System.in that we need here.
    private final Scanner clavier;
    private final String ls;
    private Display display;

    public Menu() {
        clavier = new Scanner(System.in);
        ls = System.lineSeparator();
        display = new Display();
    }

    // Method
    // Gameplay.Game Start
    public void preGameMenu() {
        System.out.println("||WELCOME TO DUNGEONS AND DRAGONS||" + ls + " ---------- ");
        int userChoice;
        Character character = null;
        boolean end = false;
        while (!end) {
            System.out.println("[MENU]" + ls +
                    "1. New Game" + ls +
                    "2. Create/Update Character" + ls +
                    "3. Show CCharacter's info" + ls +
                    "4. Exit" + ls +
                    "Type 1, 2, 3 or 4");
            // Integer.parseInt + nextLine plutôt que nextInt. nextInt ne consomme pas le \n créé quand on fait entrée. Il faut donc le consommer ou traduire un string en int, car nextLine consomme le \n
            userChoice = Integer.parseInt(clavier.nextLine());
            if (userChoice == 1) {
                if(character == null) {
                    System.out.println(" |||Please create a character|||");
                }
            }
            else if (userChoice == 2) {
                character = playerCreation();
            } else if (userChoice == 3) {
                if(character != null) {
                    display.statusDisplay(character);
                }
                else {
                    System.out.println("|||Please create a character|||");
                }
            } else if (userChoice == 4) {
                end = true;
            }
            }
        }


    // Retrieve User Information
    // Retrieve the name of the character
    public String retrieveName() {
        System.out.println("Welcome new adventurer! How should we call you ?");
        String characterName = clavier.nextLine();
        return characterName;
    }

    // Retrieve the character choice of the user
    public int retrieveCharacterChoice() {
        System.out.println("Are you a :" + ls + "1. Characters.Wizard" + ls + "Stats: Magic Power: 8 / Health: 6" + ls + "2. Characters.Warrior" + ls + "Stats: Physical Attack 5 / Health 10" + ls + "Type 1 or 2");
        int characterChoice = Integer.parseInt(clavier.nextLine());
        return characterChoice;
    }

    // Method that create the player. It retrieves info from the user and use the Characters.CharacterFactory to create it.
    public Characters.Character playerCreation() {
        String playerName = retrieveName();
        int playerClass = retrieveCharacterChoice();
        Character character = CharacterFactory.characterCreator(playerName, playerClass);
        return character;
    }


}
