package Gameplay;

import characters.Character;
import characters.Warrior;
import characters.Wizard;

import java.util.Objects;

public class Game {
    private Menu menu;
    private Board board;
    private Dice dice;
    private Character player = null;

    /**
     * Game Class & Constructor. It takes a Character player that is null for now. Important to be null for the Menu
     * The Constructor make 3 instances out of the Class Board, Dice and Menu. All are part of the Game.
     */
    public Game() {
        this.board = new Board(47);
        this.dice = new Dice();
        this.menu = new Menu(this);
    }
    // Method
    /**
     * The gameRunning Method contains all the necessary method to make the game playable.
     * For now the preGameMenu where everything is monitored.
     */
    public void gameRunning() {
        menu.preGameMenu();
    }

    /**
     * Method that create the player. It retrieves info from the user and use the Wizard or Warrior Constructor to create it.
     * Print a message with the type join.
     * @return player
     */
    public Character playerCreation() {
        String playerName = menu.retrieveName();
        String playerClass = menu.retrieveCharacterChoice();
        if(Objects.equals(playerClass, "Wizard")) {
            player = new Wizard(playerName, playerClass);
            System.out.println("Player " + playerName + ", join the wizard guild");
        } else {
            player = new Warrior(playerName, playerClass);
            System.out.println("Player " + playerName + ", join the warrior guild");
        }
        return player;
    }

    /**
     * The method startGame is a void method that start the gameplay. Runs has long as the player doesn't reach the end of the board.
     * It needs an existing character to run.
     * It has a endMenu dedicated to play a new game or to go back to the preGameMenu
     */
    public void startGame() {
        Boolean exit = false;
        board.initBoard();
        while (!exit) {
            if (player == null) {
                System.out.println("Please create a Player first");
                break;
            } else {
                while (player.getCurrentPosition() < board.getCellNb()) {
                    player.move(dice);
                    if (player.getCurrentPosition() >= board.getCellNb()) {
                        System.out.println(board.getCellNb() + "/" + board.getCellNb() + "\n Well done you've reached the end of the game !");
                    } else {
                        System.out.println(player.getCurrentPosition() + "/" + board.getCellNb());
                    }
                }
            }
            if (menu.endGameMenu() == 2) {
                exit = true;
            }
            player.setCurrentPosition(1);
        }
    }
}
