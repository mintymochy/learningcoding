#include <iostream>
#include <vector>

using namespace std;

void main() {

}
class wordle {
private:

public:
    vector<char> alp[26];
    char board[5][6];

    void createALP(vector<char> arr1) {
        for (int x : arr1) {
            arr1.push_back(char(x));
        }
    }

    void printGame() {
        for (int r = 0; r < sizeof(board) / sizeof(int); r++) {
            for (int w = 0; w < sizeof(board) / sizeof(int); w++) {
                cout << board[r][w];
            }
            cout << "\n";
        }
    }

    void createGame() {
        for (int r = 0; r < sizeof(board) / sizeof(int); r++) {
            for (int w = 0; w < sizeof(board) / sizeof(int); w++) {
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