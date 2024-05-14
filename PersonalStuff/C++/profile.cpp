#include <iostream>
#include <vector>
using namespace std;

int main()
{
  return 0;
}
class profile
{
private:
  string name;
  int age;
  string city;
  string country;
  string pronouns;
  vector<string> hobbies;

public:
  profile()
  {
    name = "user";
    pronouns = "they/them";
    city = "unknown";
    country = "unknown";
    hobbies = hobbies;
  }
  void createProfile()
  {
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
    cout << "Enter your pronouns";
    cin >> p;
    cout << "Enter your city";
    cin >> c;
    cout << "Enter your country";
    cin >> co;
  }

  void setName(string name)
  {
    name = name;
  }

  string getName()
  {
    return name;
  }

  void setAge(int age)
  {
    age = age;
  }

  int getAge()
  {
    return age;
  }

  void setCity(string city)
  {
    city = city;
  }

  string getCity()
  {
    return city;
  }

  void setCountry(string country)
  {
    country = country;
  }

  string getCountry()
  {
    return country;
  }

  void addHobbies(string hobby)
  {
    hobbies.push_back(hobby);
  }
};