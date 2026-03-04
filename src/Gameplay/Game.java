package Gameplay;

import Characters.CharacterFactory;
import Characters.Character;

public class Game {
    private Menu menu;
    private Board board;
    private Dice dice;
    private Display display;
    private Character player = null;

    public Game() {
        this.menu = new Menu();
        this.board = new Board(47);
        this.dice = new Dice();
        this.display = new Display();
    }
    // Method that gather the method that run the game
    public void gameRunning() {
        menu.preGameMenu();
        board.initBoard();
    }

    // Method that create the player. It retrieves info from the user and use the Characters.CharacterFactory to create it.
    public Character playerCreation() {
        String playerName = menu.retrieveName();
        int playerClass = menu.retrieveCharacterChoice();
        player = CharacterFactory.characterCreator(playerName, playerClass);
        return player;
    }

    public void startGame() {
        Boolean exit = false;
        board.initBoard();
        while(!exit) {
            while (player.getCurrentPosition() < 47) {
                player.move(dice);
                System.out.println(player.getCurrentPosition() + "/" + board.getCellNb());
            }
            if(menu.endGameMenu() == 2) {
                exit = true;
            }
            player.setCurrentPosition(1);
        }
    }

    public void endGame() {
        menu.endGameMenu();

    }

//    public void gameRound() {
//        character
//    }








}
