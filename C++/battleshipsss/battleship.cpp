#include <iostream>
using namespace std;

int main() {
    return 0;
}
class battleship {
public:
    char board[10][10];
    char alp[10] = { 'A', 'B', 'C', 'D', 'E', 'F', 'H', 'I', 'J', 'K' };
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
                cout << alp[r] + " | " + board[r][w] + board[r][w + 1] + board[r][w + 2] + board[r][w + 3] + board[r][w + 4] + " |";
            }
        }
    }

    void addShip() {
        string shipPlacement;
        cout << "Where do you want to place your ship?: ";
        cin >> shipPlacement;

    }

    void attack() {
        string attack;
        cout << "Where do you want to place your ship?: ";
        cin >> attack;
    }

    int checkShot(string shot) {
        char shotLetter = shot[0];
        for (int i = 0; i <= sizeof(alp); i++) {
            if (shotLetter != alp[i]) {
                return -1;
            }
            return i;
        }
    }
};