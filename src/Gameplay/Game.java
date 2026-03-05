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

    public Game() {
        this.board = new Board(47);
        this.dice = new Dice();
        this.menu = new Menu(this);
    }
    // Method that gather the method that run the game
    public void gameRunning() {
        menu.preGameMenu();
        board.initBoard();
    }

    // Method that create the player. It retrieves info from the user and use the Characters.CharacterFactory to create it.
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

    public void endGame() {
        menu.endGameMenu();
    }








}
