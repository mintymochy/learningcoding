#include <iostream>
using namespace std;
int myNum = 5;               // Integer (whole number without decimals)
double myFloatNum = 5.99;    // Floating point number (with decimals)
char myLetter = 'D';         // Character
string myText = "Hello";     // String (text)
bool myBoolean = true;       // Boolean (true or false)


int main() {
  string socialStatus;
  cout << "m";
  cout << "meow meow meow" << endl;
  int meows = 35;
  cout << "I am " << meows << " years old.";
  cout << "Enter your ssn pwease :3 : ";
  cin >> socialStatus;
  return 0;
}
class Clock {
private:
  int time = 1200;

public:
  // Accessor function for time
  int getTime() {
    return time;
  }
};

int main() {
  Clock alarm;
  cout << alarm.getTime(); // Output: 1200
}