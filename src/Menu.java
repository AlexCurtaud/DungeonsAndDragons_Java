import java.util.Scanner;

public class Menu {
    // The class Scanner has many useful tools like the System.in that we need here.
    private final Scanner clavier;
    private final String ls;

    public Menu() {
        clavier = new Scanner(System.in);
        ls = System.lineSeparator();
    }

    // Method
    // Game Start
    public void gameStart() {
        System.out.println("Welcome to Dungeon and Dragon" + ls + ls + "1.New Game" + ls + "2. Exit" + ls + "Type 1 or 2");
        // Integer.parseInt + nextLine plutôt que nextInt. nextInt ne consomme pas le \n créé quand on fait entrée. Il faut donc le consommer ou traduire un string en int, car nextLine consomme le \n
        int userChoice = Integer.parseInt(clavier.nextLine());
        if(userChoice == 2) {
            System.exit(0);
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
        System.out.println("Are you a :" + ls + "1. Wizard" + ls + "2. Warrior" + ls + "Type 1 or 2");
        int characterChoice = Integer.parseInt(clavier.nextLine());
        return characterChoice;
    }
}
