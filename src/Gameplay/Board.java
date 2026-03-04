package Gameplay;

public class Board {
    private final int cellNb;
    //private final int ennemyNb;
    //private final int mysteryBoxNb;

    public Board(int cellNb) {
        this.cellNb = cellNb;
    }

    // GETTER
    // Cell Number
    public int getCellNb() {
        return cellNb;
    }

    // Method
    // This Method initialize the board
    public Cell[] initBoard() {
        Cell [] board = new Cell[cellNb];
        for (int i = 1; i <= board.length; i++) {
            board[i-1] = new Cell(i);
        }
        return board;
    }


}
