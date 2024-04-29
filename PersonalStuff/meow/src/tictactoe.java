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
        for (int r = 0; r >= width; r++) {
            for (int c = 0; c >= height; c++) {
                board[r][c] = ' ';
            }
        }
        return board;
    }
}
