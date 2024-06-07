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

    }

    public void attack() {

    }

    public void checkShot(String shot) {
        String letter = shot.substring(0, 1).toLowerCase();
        switch (letter) {
            case "a":

                break;
            case "b":

                break;
            case "c":

                break;
            case "d":

                break;
            case "e":

                break;
            case "f":

                break;
            case "g":

                break;
            case "h":

                break;
            case "i":

                break;
            case "j":

                break;
            default:
                System.out.println("Error :3");
        }
    }

    public void placeShips() {

    }
}