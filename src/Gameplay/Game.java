package Gameplay;

public class Game {
    private Menu menu;
    private Board board;
    private Dice dice;
    private Display display;

    public Game() {
        this.menu = new Menu();
        this.board = new Board(10, 7);
        this.dice = new Dice();
        this.display = new Display();
    }
    // Method that gather the method that run the game
    public void gameRunning() {
        menu.preGameMenu();
        board.initBoard();
    }

//    public void gameRound() {
//        character
//    }








}
