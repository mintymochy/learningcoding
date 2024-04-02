package Unit_6_7_8.ConnectFourProject;

import java.util.*;

/*
 04-02-2024
 augustjones
 :3
 */
public class Runner {
    static ConnectFour connectFour = new ConnectFour();
    static TicTacToe tictactoe = new TicTacToe();

    public static void main(String[] args) {
        playtictactoe();
    }

    public static void playconnnectFour() {
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

    public static void playtictactoe() {
        tictactoe.CreateBoard();
        tictactoe.PrintBoard();
    }
}
