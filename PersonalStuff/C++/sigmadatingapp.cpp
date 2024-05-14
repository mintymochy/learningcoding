#include <iostream>
#include <vector>
using namespace std;

int main() {
  
  return 0;
}
class profile{
    private:
      string name;
      int age;
      string city;
      string country;
      string pronouns;
      vector<string> hobbies;
    public:
      profile() {
        name = "Kai Cenat";
        pronouns = "they/them";
        city = "New Sigma";
        country = "USR"; // united states of rizzdom
        hobbies = hobbies;
      }
      void createProfile(){

      }

      void setName(string name){
        name = name;
      }

      string getName(){
        return name;
      }

      void setAge(int age){
        age = age;
      }

      int getAge(){
        return age;
      }

      void setCity(string city){
        city = city;
      }

      string getCity(){
        return city;
      }

      void setCountry(string country){
        country = country;
      }

      string getCountry(){
        return country;
      }

      void addHobbies(string hobby){
        hobbies.push_back(hobby);
      }

    };