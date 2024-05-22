#include <iostream>
using namespace std;

int main() {
    return 0;
}
class battleship {
public:
    char board[10][10];
    string alp[10] = { "A", "B", "C", "D", "E", "F", "H", "I", "J", "K" };
    void createBoard() {
        for (int r = 0; r < sizeof(board) / sizeof(int); r++) {
            for (int w = 0; w < sizeof(board[0]) / sizeof(int); w++) {
                board[r][w] = ' ';
            }
        }
    }

    void printBoard() {
        for (int r = 0; r < sizeof(board) / sizeof(int); r++) {
            for (int w = 0; w < sizeof(board[0]) / sizeof(int); w++) {
                cout << ;
            }
        }
    }

    void addShip() {
        string shipPlacement;
        cout << "Where do you want to place your ship?: ";
        cin >> shipPlacement;
    }

    void attack() {

    }

    void checkShot() {

    }
};