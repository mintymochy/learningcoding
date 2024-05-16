package Unit_6_7_8.ConnectFourProject;

import java.util.*;

public class Connect4Example {
    final static int WIDTH = 6;
    final static int HEIGHT = 6;
    final static int BOTTOM_ROW = WIDTH - 1;
    static char[][] board = new char[WIDTH][HEIGHT];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // creates board
        CreateBoard();
        PrintBoard();
        DropX();
        PrintBoard();
        DropO();
        PrintBoard();
    }

    public static void CreateBoard() {
        // fills board with '.' for the width and height
        for (int w = 0; WIDTH > w; w += 1) {
            for (int h = 0; HEIGHT > h; h += 1) {
                board[w][h] = '.';
            }
        }
    }

    public static void PrintBoard() {
        // prints the board
        for (int w = 0; WIDTH > w; w += 1) {
            for (int h = 0; HEIGHT > h; h += 1) {
                System.out.print(board[w][h]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void DropX() {
        // creates a counter
        int counter = 1;
        // shows whos turn
        System.out.println("Player 1 turn");
        // gets input
        int column = scanner.nextInt();
        while (true) {
            if (column > WIDTH) {
                System.out.println("That's not a valid column");
                break;
            }
            if (board[BOTTOM_ROW][column] == '.') { // checks to see if space is blank, puts X there if it is
                board[BOTTOM_ROW][column] = 'X';
                break; // breaks loop after placing
            } else if (board[BOTTOM_ROW][column] == 'X' || board[BOTTOM_ROW][column] == 'O') { // if space isn't blank,
                                                                                               // checks to see if one
                                                                                               // above is
                if (board[BOTTOM_ROW - counter][column] == '.') { // puts X if blank
                    board[BOTTOM_ROW - counter][column] = 'X';
                    break; // breaks loop after placing
                }
            }
            counter += 1; // adds one to counter if the space wasn't blank, then loops again
            if (counter == WIDTH) { // checks to see if at end of column
                System.out.println("That column is full");
                break;
            }
        }
    }

    public static void DropO() {
        // creates a counter
        int counter = 1;
        // shows whos turn
        System.out.println("Player 2 turn");
        // gets input
        int column = scanner.nextInt();
        while (true) {
            if (column > WIDTH) {
                System.out.println("That's not a valid column");
                break;
            }
            if (board[BOTTOM_ROW][column] == '.') { // checks to see if space is blank, puts O there if it is
                board[BOTTOM_ROW][column] = 'O';
                break; // breaks loop after placing
            } else if (board[BOTTOM_ROW][column] == 'X' || board[BOTTOM_ROW][column] == 'O') { // if space isn't blank,
                                                                                               // checks to see if one
                                                                                               // above is
                if (board[BOTTOM_ROW - counter][column] == '.') { // puts O if blank
                    board[BOTTOM_ROW - counter][column] = 'O';
                    break; // breaks loop after placing
                }
            }
            counter += 1; // adds one to counter if the space wasn't blank, then loops again
            if (counter == WIDTH) { // checks to see if at end of column
                System.out.println("That column is full");
                break;
            }
        }
    }
}