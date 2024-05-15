package Unit_6_7_8.ConnectFourProject;

import java.util.*;

import Unit_6_7_8.tictactoe;

/*
 04-02-2024
 augustjones
 :3
 */
public class Runner {
    static ConnectFour connectFour = new ConnectFour();
    static TicTacToe TicTacToe = new TicTacToe();

    public static void main(String[] args) {
        playticTacToe();
    }

    public static void playConnnectFour() {
        connectFour.CreateBoard();
        connectFour.PrintBoard();
        do {
            connectFour.DropX();
            connectFour.PrintBoard();
            connectFour.checkWin();
            connectFour.DropO();
            connectFour.PrintBoard();
        } while (!connectFour.checkWin()); // keeps running the connectFour until check win returns true
    }

    public static void playticTacToe() {
        TicTacToe.CreateBoard();
        TicTacToe.PrintBoard();
        // do
        // {ticTacToe.DropX();ticTacToe.PrintBoard();ticTacToe.checkWin();ticTacToe.DropO();ticTacToe.PrintBoard();}
        // while (!ticTacToe.checkWin());
    }
}
