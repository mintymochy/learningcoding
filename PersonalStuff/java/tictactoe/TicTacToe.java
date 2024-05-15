package PersonalStuff.java.tictactoe;

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
        char player = ' ';
        int row = 0;
        int col = 0;
        if (turn == 0) {
            player = 'X';
        } else {
            player = 'O';
        }
        System.out.print("Where do you want to place your " + player + " ?: ");
        String s1 = scanner.next().toUpperCase().stripTrailing();
        char c1 = s1.charAt(0);// col
        char c2 = s1.charAt(1);// row
        if (c1 == 'A') {
            col = 0;
        } else if (c1 == 'B') {
            col = 1;
        } else if (c1 == 'C') {
            col = 2;
        }
        if (c2 == '1') {
            row = 0;
        } else if (c2 == '2') {
            row = 1;
        } else if (c2 == '3') {
            row = 2;
        }
        b[row][col] = player;
        // ending turn
        if (turn == 0) {
            turn = 1;
        } else {
            turn = 0;
        }

    }

    public void DropO() {

    }

}
