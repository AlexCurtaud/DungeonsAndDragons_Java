package Gameplay;

import Characters.Character;
import Characters.Warrior;
import Characters.Wizard;
import Enum.PlayerClass;
import Exception.PlayerTypeInvalidException;

import java.util.ArrayList;

/**
 * The Game class represent the link between each class. Its goal is to initiate the game using the different classes and methods
 */
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
        this.board = new Board(4);
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
     * Method that create the player. It retrieves info from the user and use the Wizard or WARRIOR Constructor to create it.
     * Two exceptions can be caught and returned as the PlayerTypeInvalidException
     * Print a message that say player's name join a type name guild.
     * @return player
     */
    public Character playerCreation() throws PlayerTypeInvalidException {
        String playerName = menu.retrieveName();
        String retrieveClass= null;
        try {
            retrieveClass = menu.retrieveCharacterChoice();
        } catch (NumberFormatException e) {
            throw new PlayerTypeInvalidException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new PlayerTypeInvalidException();
        }
        if(PlayerClass.WIZARD.getName().equalsIgnoreCase(retrieveClass)) {
            player = new Wizard(playerName, retrieveClass, 6);
            System.out.println("Player " + playerName + ", join the wizard guild");
        } else if (PlayerClass.WARRIOR.getName().equalsIgnoreCase(retrieveClass)) {
            player = new Warrior(playerName, retrieveClass, 10);
            System.out.println("Player " + playerName + ", join the warrior guild");
        } else {
            throw new PlayerTypeInvalidException();
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
        ArrayList<Cell> cells = board.initBoard();

        while (!exit) {
            if (player == null) {
                System.out.println("Please create a Player first");
                break;
            } else {
                while (player.getCurrentPosition() < board.getCellNb()) {
                    player.move(dice);
                    if (player.getCurrentPosition() >= board.getCellNb()) {
//                        System.out.println(board.getCellNb() + "/" + board.getCellNb() + "\n Well done you've reached the end of the game !");
                        System.out.println(cells.get(player.getCurrentPosition()-1));
                    } else {
//                        System.out.println(player.getCurrentPosition() + "/" + board.getCellNb());
                        System.out.println(cells.get(player.getCurrentPosition()-1));
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
