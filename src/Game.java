public class Game {
    private Menu menu;
    private Board board;
    private Dice dice;
    private Display display;

    public Game() {
        this.menu = new Menu();
        menu.gameStart();
        this.board = new Board(10, 7);
        this.dice = new Dice();
        this.display = new Display();
    }

    public Character playerCreation() {
        String playerName = menu.retrieveName();
        int playerClass = menu.retrieveCharacterChoice();
        Character character = CharacterFactory.characterCreator(playerName, playerClass);
        display.statusDisplay(playerClass);
        return character;
    }

}
