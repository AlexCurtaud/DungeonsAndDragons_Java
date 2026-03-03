package Gameplay;

public class Board {
    private final int caseNb = 47;
    private final int ennemyNb;
    private final int mysteryBoxNb;

    public Board(int ennemyNb, int mysteryBoxNb) {
        this.ennemyNb = ennemyNb;
        this.mysteryBoxNb = mysteryBoxNb;
    }

    // Method
    // This Method initialize the board
    public int[] initBoard() {
        int [] board = new int[caseNb];
        System.out.println(board.length);
        for (int i = 1; i <= board.length; i++) {
            board[i-1] = i;
        }
        return board;
    }
}
