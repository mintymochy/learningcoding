#include <iostream>
#include <vector>
using namespace std;

int main() {
  return 0;
}
class profile {
private:
  string name;
  int age;
  string city;
  string country;
  string pronoun;
public:
  vector<string> hobbies;
  profile() {
    name = "user";
    pronoun = "they/them";
    city = "unknown";
    country = "unknown";
    hobbies = hobbies;
  }
  void createProfile() {
    int a;
    string n;
    string p;
    string c;
    string co;
    string hobby;
    cout << "Time to create your user profile!";
    cout << "Enter your name: ";
    cin >> n;
    cout << "Enter your age";
    cin >> a;
    cout << "Enter your pronoun";
    cin >> p;
    cout << "Enter your city";
    cin >> c;
    cout << "Enter your country";
    cin >> co;
    setName(n);
    setAge(a);
    setPronoun(p);
    setCity(c);
    setCountry(co);
    cout << "Now enter all of your hobbies! \nWhen you are done enter 'n'.";
    do {
      cin >> hobby;
      hobbies.push_back(hobby);
    } while (hobby != "n");
  }

  void setName(string name) {
    name = name;
  }

  string getName() {
    return name;
  }

  void setAge(int age) {
    age = age;
  }

  int getAge() {
    return age;
  }

  void setCity(string city) {
    city = city;
  }

  string getCity() {
    return city;
  }

  void setCountry(string country)
  {
    country = country;
  }

  string getCountry() {
    return country;
  }

  void setPronoun(string pronoun) {
    pronoun = pronoun;
  }
  string getPronoun() {
    return pronoun;
  }

  void addHobbies(string hobby) {
    hobbies.push_back(hobby);
  }
};