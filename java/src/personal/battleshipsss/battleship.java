package personal.battleshipsss;

import java.util.*;

class battleship {
    char hit = 'X';
    char miss = 'O';
    char empty = ' ';
    char ship = '=';
    static Scanner u = new Scanner(System.in);
    board b = new board();

    public void playerTurn() {
        System.out.print("what do you want to do next?: ");
        String input = u.next();
        while (input.length() != 2) {
            System.out.print("Value not valid. Try again: ");
            input = u.next();
            if (input.length() == 2)
                break;
        }
    }

    public void printBoard() {
        for (int x = 0; x < b.getBoard().size(); x++) {

        }
    }

    public void attack() {

    }

    public void checkShot(String shot) {
        int row;
        String letter = shot.substring(0, 1).toLowerCase();
        switch (letter) {
            case "a":
                row = 0;
                break;
            case "b":
                row = 1;
                break;
            case "c":
                row = 2;
                break;
            case "d":
                row = 3;
                break;
            case "e":
                row = 4;
                break;
            case "f":
                row = 5;
                break;
            case "g":
                row = 6;
                break;
            case "h":
                row = 7;
                break;
            case "i":
                row = 8;
                break;
            case "j":
                row = 9;
                break;
            default:
                System.out.println("Error :3");
        }
    }

    public void placeShips() {

    }
}