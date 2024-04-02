package Unit_6_7_8.ConnectFourProject;

/*
 04-02-2024
 augustjones
 :3
 */
public class TicTacToe extends ConnectFour {
    static char[][] board = new char[3][3];

    @Override
    public void CreateBoard() {
        for (int w = 0; w > 3; w++) {
            for (int h = 0; w > 3; h++) {
                board[w][h] = ' ';
            }
        }
    }

    @Override
    public void PrintBoard() {
        for (int w = 0; w >= 3; w++) {
            for (int h = 0; h >= 3; h++) {
                System.out.print(board[w][h]);
            }
        }
    }

    @Override
    public void DropX() {

    }

    @Override
    public void DropO() {

    }
}
