#include <iostream>
#include <vector>
using namespace std;

int main() {
    return 0;
}
class wordle {
public:
    vector<char> alp[26];
    char board[6][5];

    void createALP(vector<char> arr1) {
        for (int x : arr1) {
            arr1.push_back(char(x));
        }
    }

    void printGame() {
        cout << "------------------";
        for (int r = 0; r < sizeof(board) / sizeof(int); r++) {
            for (int w = 0; w < sizeof(board[0]) / sizeof(int); w++) {
                cout << "| " + board[r][w] + " | " + board[r][w + 1] + " | " + board[r][w + 2] + " | " + board[r][w + 3] + " | " + board[r][w + 4] + " | " + board[r][w + 5] + " | ";
            }
            cout << "\n";
        }
    }

    void createGame() {
        for (int r = 0; r < sizeof(board) / sizeof(int); r++) {
            for (int w = 0; w < sizeof(board[0]) / sizeof(int); w++) {
                board[r][w] = ' ';
            }
        }
    }

    void guess() {
        string userInput;
        cout << "What is your first guess?: ";
        cin >> userInput;

    }

    vector<int> check(vector<int> arr) {

        return arr;
    }
};