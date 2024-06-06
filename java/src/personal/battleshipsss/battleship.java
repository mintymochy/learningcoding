package personal.battleshipsss;

import java.util.*;

class battleship {
    char hit = 'X';
    char miss = 'O';
    char empty = ' ';
    char ship = '=';
    static Scanner uI = new Scanner(System.in);
    board b = new board();

    public void playerTurn() {
        System.out.print("what do you want to do next?: ");
        String input = uI.nextLine();
    }

    public void printBoard() {
        b.getBoard();
    }

    public void attack() {

    }

    public void checkShot(String shot) {
        switch (shot) {

        }
    }

    public void placeShips() {

    }
}