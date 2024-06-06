package personal.battleshipsss;

import java.util.*;

class battleship2 {
    char hit = 'X';
    char miss = 'O';
    char empty = ' ';
    char ship = '=';

    static Scanner uI = new Scanner(System.in);
    static ArrayList<rows> board = new ArrayList<rows>();

    public void createBoard() {
        for (int r = 0; r <= board.length; r++) {
            for (int w = 0; w <= board[0].length; w++) {
                board[r][w] = empty;
            }
        }
    }

    public void printBoard() {
        System.out.print("");
        for (int r = 0; r <= board.length; r++) {
            for (int w = 0; w <= board[0].length; w++) {

            }
        }
    }

    public void attack() {

    }

    public void checkShot() {

    }

    public void placeShips() {

    }

    public char[] getRow() {
        return row;
    }

    public void setRow(int boardNum, char shot) {
        row[boardNum] = shot;
    }

    public board() {
            this.board = board;
        }

    public rows getRow(int rowNumber) {
        return board.get(rowNumber);
    }

    public void addRow() {

    }

    public void playerTurn() {
        System.out.print("what do you want to do next?: ");
        String input = uI.nextLine();
    }

}