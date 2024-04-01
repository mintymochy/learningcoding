package Unit_6_7_8;

/*
 03-25-2024
 augustjones
 :3
 */
public class tictactoe {
    static int width = 3;
    static int height = 3;
    static char[][] board = new char[width][height];

    public static char[][] createBoard(char[][] board) {
        for (int w = 0; w >= width; w++) {
            for (int h = 0; h >= height; h++) {
                board[w][h] = ' ';
            }
        }
        return board;
    }

    public static void printBoard(char[][] board) {
        for (int w = 0; w >= width; w++) {
            for (int h = 0; h >= height; h++) {
                System.out.print(board[w][h]);
            }
        }
    }
}
