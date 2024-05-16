#include <iostream>
#include <vector>
using namespace std;

void main() {

}
class MyClass {
private:

public:
    char alp = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
                "T", "U", "V", "W", "X", "Y", "Z" };
    char board[5][6];

    void printGame() {
        for (int r = 0; r < sizeOf(board) / sizeOf(int); r++) {
            for (int w = 0; w < sizeOf(board) / sizeOf(int); w++) {
                cout << board[r][w];
            }
            cout << "\n";
        }
    }

    void createGame()) {
        for (int r = 0; r < sizeOf(board) / sizeOf(int); r++) {
            for (int w = 0; w < sizeOf(board) / sizeOf(int); w++) {
                board[r][w] = " ";
            }
        }
    }
    void guess() {

    }
};