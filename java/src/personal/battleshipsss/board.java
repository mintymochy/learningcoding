package personal.battleshipsss;

import java.util.*;

/*
 05-31-2024
 augustjones
 :3
 */
public class board {
    static ArrayList<rows> board = new ArrayList<rows>();
    static rows r = new rows();

    public board() {
        this.board = board;
    }

    public void fillBoard() {
        board
    }

    public ArrayList<rows> getBoard() {
        return board;
    }

    public rows getRow(int rowNumber) {
        return board.get(rowNumber);
    }

    public void addRow(rows row) {
        board.add(row);
    }
}
