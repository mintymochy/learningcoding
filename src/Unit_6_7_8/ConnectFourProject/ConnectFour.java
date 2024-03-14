package Unit_6_7_8.ConnectFourProject;

import java.util.*;

/* 
 August Jones 
 02-26-2024
 AP CSA
 :3
*/
public class ConnectFour {
    final static int width = 6;
    final static int height = 6;
    final static int bottom_row = width - 1;
    static char[][] board = new char[width][height];
    static Scanner uI = new Scanner(System.in);

    public static void main(String[] args) {
        CreateBoard();
        PrintBoard();
        do {
            DropX();
            PrintBoard();
            checkWin();
            DropO();
            PrintBoard();
        } while (!checkWin()); // keeps running the game until check win returns true
    }

    public static void CreateBoard() { // creates the board
        for (int w = 0; width > w; w += 1) {
            for (int h = 0; height > h; h += 1) {
                board[w][h] = ' ';
            }
        }
    }

    public static void PrintBoard() { // prints the board
        for (int w = 0; width > w; w++) {
            for (int h = 0; height > h; h++) {
                System.out.print("|");
                System.out.print(board[w][h]);
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("̅‾‾‾‾‾‾‾‾‾‾‾‾̅");
    }

    public static void DropX() {
        int counter = 1;
        System.out.print("Player 1's Turn!\nWhere do you want to drop? (enter 0-5): ");
        int column = uI.nextInt();
        System.out.println();
        while (true) {
            if (board[bottom_row][column] == ' ') { // checks to see if column is empty and adds an X if it is
                board[bottom_row][column] = 'X';
                break;
            } else if (board[bottom_row][column] == 'X' || board[bottom_row][column] == 'O') { // if the board isnt
                // empty it'll add an X to the space right above the filled space
                if (board[bottom_row - counter][column] == ' ') {
                    board[bottom_row - counter][column] = 'X';
                    break;
                }
            }
            counter += 1;
            if (counter == width) { // checks if column is full
                System.out.println("Column is full");
                break;
            }
        }
    }

    public static void DropO() {
        int counter = 1;
        System.out.print("Player 2's Turn!\nWhere do you want to drop? (enter 0-5): ");
        int column = uI.nextInt();
        System.out.println();
        while (true) {
            if (board[bottom_row][column] == ' ') { // checks to see if column is empty and adds an O if it is
                board[bottom_row][column] = 'O';
                break;
            } else if (board[bottom_row][column] == 'X' || board[bottom_row][column] == 'O') { // if the board isnt
                // empty it'll add an O to the space right above the filled space
                if (board[bottom_row - counter][column] == ' ') {
                    board[bottom_row - counter][column] = 'O';
                    break;
                }
            }
            counter += 1;
            if (counter == width) { // checks if column is full
                System.out.println("Column is full");
                break;
            }
        }
    }

    public static boolean checkWin() { // asking the players if anyone has gotten four in a row yet for a win condition
        boolean winCondition;
        System.out.println("Has anyone won? (y/n):");
        String outcome = uI.next().toLowerCase();
        if (outcome.equals("y")) {
            System.out.println("Player wins!");
            winCondition = true;
        } else {
            System.out.println("Next Round!");
            winCondition = false;
        }
        System.out.println();
        return winCondition;
    }
}