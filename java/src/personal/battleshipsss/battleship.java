package personal.battleshipsss;

import java.util.*;

class battleship {
    char hit = 'X';
    char miss = 'O';
    char empty = ' ';
    char ship = '=';
    static Scanner u = new Scanner(System.in);
    board b = new board();
    rows row1 = new rows();
    rows row2 = new rows();
    rows row3 = new rows();
    rows row4 = new rows();
    rows row5 = new rows();
    rows row6 = new rows();
    rows row7 = new rows();
    rows row8 = new rows();
    rows row9 = new rows();
    rows row10 = new rows();

    public void gameStart() {
        b.fillBoard(row1);
        b.fillBoard(row2);
        b.fillBoard(row3);
        b.fillBoard(row4);
        b.fillBoard(row5);
        b.fillBoard(row6);
        b.fillBoard(row7);
        b.fillBoard(row8);
        b.fillBoard(row9);
        b.fillBoard(row10);

    }

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
        System.out.println("   A B C D E F G H I J ");
        System.out.println("  +-+-+-+-+-+-+-+-+-+-+");
        for (int x = 0; x < b.getBoard().size(); x++) {
            for (int y = 0; y < row1.getLength(); y++) {
                rows row = b.getRow(x);
                System.out.println();
            }
        }
    }

    public int checkShotLetter(String shot) {
        String letter = shot.substring(0, 1).toLowerCase();
        switch (letter) {
            case "a":
                return 0;
            case "b":
                return 1;
            case "c":
                return 2;
            case "d":
                return 3;
            case "e":
                return 4;
            case "f":
                return 5;
            case "g":
                return 6;
            case "h":
                return 7;
            case "i":
                return 8;
            case "j":
                return 9;
            default:
                return -1;
        }
    }

    public int checkShotNumber(String shot) {
        String number = shot.substring(1, 2).toLowerCase();
        switch (number) {
            case "0":
                return 0;
            case "1":
                return 1;
            case "2":
                return 2;
            case "3":
                return 3;
            case "4":
                return 4;
            case "5":
                return 5;
            case "6":
                return 6;
            case "7":
                return 7;
            case "8":
                return 8;
            case "9":
                return 9;
            default:
                return -1;
        }
    }

    public void placeShips() {

    }

    public void attack() {

    }
}