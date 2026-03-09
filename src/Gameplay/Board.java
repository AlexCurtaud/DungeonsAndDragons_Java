package Gameplay;

import DefensiveEquipment.Potion;
import Enemy.Gobelin;
import OffensiveEquipment.Weapon;

import java.util.ArrayList;

/**
 * Every boardgames has a Board. This class represent the board
 */
public class Board {
    private int cellNb;
    protected ArrayList<Cell> cells;

    /**
     * Board Constructor, for now it is made out of a number of cells and contain an ArrayList of Cells
     * @param cellNb
     */
    public Board(int cellNb) {
        this.cellNb = cellNb;
        this.cells = new ArrayList<Cell>();
    }

    // GETTER

    /**
     * Get the cell number of the board
     * @return the Board cell number
     */
    public int getCellNb() {
        return cellNb;
    }

    // Method
    /**
     * Board Initialisation method. It creates an ArrayList of Cell as long as its number of cell.
     * Each cell is made manually for now.
     * @return an ArrayList of Cell
     */
    public ArrayList<Cell> initBoard() {
        cells.add(0, new Cell(1, null, null, null));
        cells.add(1, new Cell(2, new Gobelin("Gobelin", 9, "Gobelin"), null, null));
        cells.add(2, new Cell(3, null, new Weapon("Basic Sword", "Common", "Weapon", 5, "Sword"), null));
        cells.add(3, new Cell(4, null, null, new Potion("Standard Potion", "Common", "Health", 2)));
        return cells;
    }


}
