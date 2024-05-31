package personal.battleshipsss;

import java.util.*;

class battleship {
    char hit = 'X';
    char miss = 'O';
    char empty = ' ';
    char ship = '=';
    static char[][] board = new char[10][10];
    static Scanner uI = new Scanner(System.in);

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

}