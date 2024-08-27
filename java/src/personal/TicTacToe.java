package personal;

import java.util.Scanner;

/*
 04-02-2024
 augustjones
 :3
 */
public class TicTacToe {
    char[][] b = new char[3][3];
    Scanner scanner = new Scanner(System.in);
    int turn = 0;

    public void CreateBoard() {
        for (int w = 0; w < 3; w += 1) {
            for (int h = 0; h < 3; h += 1) {
                b[w][h] = ' ';
            }
        }
    }

    public void PrintBoard() { // prints the board
        System.out.println("    A   B   C  ");
        System.out.println("  +---+---+---+");
        for (int w = 0; w < 3; w++) {
            for (int h = 0; h < 3; h += 3) {
                System.out.println((w + 1) + " | " + b[w][h] + " | " + b[w][h + 1] + " | " + b[w][h + 2] + " |");
            }
            System.out.println("  +---+---+---+");
        }
    }

    public void Drop() {
        char player;
        int row = 0;
        int col = 0;
        if (turn == 0) {
            player = 'X';
        } else {
            player = 'O';
        }
        System.out.print("Where do you want to place your " + player + " ?: ");
        String s1 = scanner.next().toUpperCase().stripTrailing();
        char shotCol = s1.charAt(0);// col
        char shotRow = s1.charAt(1);// row
        switch (shotCol) {
            case 'A':
                col = 0;
                break;
            case 'B':
                col = 1;
                break;
            case 'C':
                col = 2;
                break;
            default:
                break;
        }
        switch (shotRow) {
            case '1':
                row = 0;
                break;
            case '2':
                row = 1;
                break;
            case '3':
                row = 2;
                break;
            default:
                break;
        }
        b[row][col] = player;
        // ending turn
        if (turn == 0) {
            turn = 1;
        } else {
            turn = 0;
        }

    }

    public boolean checkWin(char shotCol, char shotRow) {
        if (b[shotRow + 1][shotCol] == b[shotRow][shotCol]) {
            if (b[shotRow + 2][shotCol] == b[shotRow][shotCol]) {
                return true;
            }
        }
        if (b[shotRow][shotCol + 1] == b[shotRow][shotCol]) {
            if (b[shotRow][shotCol + 2] == b[shotRow][shotCol]) {
                return true;
            }
        }
        return false;
    }

}