package Unit_6_7_8.ConnectFourProject;

import java.util.Scanner;

/*
 04-02-2024
 augustjones
 :3
 */
public class TicTacToe extends ConnectFour {
    char[][] b = new char[3][3];
    Scanner scanner = new Scanner(System.in);

    @Override
    public void CreateBoard() {
        for (int w = 0; w < 3; w += 1) {
            for (int h = 0; h < 3; h += 1) {
                b[w][h] = ' ';
            }
        }
    }

    @Override
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

    @Override
    public void DropX() {
        System.out.println("Where do you want to place your x? enter the letter then the number.");
        int row = scanner.nextInt() - 1;
        int col;
        String coltemp = scanner.next().toUpperCase();
        if (coltemp.equals("A")) {
            col = 0;
        } else if (coltemp.equals("B")) {
            col = 1;
        } else if (coltemp.equals("C")) {
            col = 2;
        }

    }

    @Override
    public void DropO() {

    }
}
