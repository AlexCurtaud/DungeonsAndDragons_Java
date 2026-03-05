package Gameplay;

public class Board {
    private final int cellNb;
    //private final int ennemyNb;
    //private final int mysteryBoxNb;

    /**
     * Board Constructor, for now it is made out of a number of cells
     * @param cellNb
     */
    public Board(int cellNb) {
        this.cellNb = cellNb;
    }

    // GETTER

    /**
     * Get the cell number of the board
     * @return
     */
    public int getCellNb() {
        return cellNb;
    }

    // Method
    /**
     * Board Initialisation method. It creates a board of Cell as long as its number of cell.
     * It creates a Cell Object has many times as the cellNb attribute of the board.
     * @return board of Cell
     */
    public Cell[] initBoard() {
        Cell [] board = new Cell[cellNb];
        for (int i = 1; i <= board.length; i++) {
            board[i-1] = new Cell(i);
        }
        return board;
    }


}
