package Unit_6_7_8.ConnectFourProject;

/*
 04-02-2024
 augustjones
 :3
 */
public class TicTacToe extends ConnectFour {
    char[][] tboard = new char[3][3];

    @Override
    public void CreateBoard() {
        for (int w = 0; 3 > w; w += 1) {
            for (int h = 0; 3 > h; h += 1) {
                tboard[w][h] = ' ';
            }
        }
    }

    @Override
    public void PrintBoard() { // prints the board
        for (int w = 0; 3 > w; w++) {
            for (int h = 0; 3 > h; h++) {
                System.out.print("|");
                System.out.print(tboard[w][h]);
            }
            System.out.print("|");
            System.out.println();
            for (int h = 0; 3 > h; h++) {
                System.out.print("-");
            }
            System.out.println("");
        }
    }

    @Override
    public void DropX() {

    }

    @Override
    public void DropO() {

    }
}
