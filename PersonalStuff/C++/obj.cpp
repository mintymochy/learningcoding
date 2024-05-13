#include <iostream>
#include <string>

int main() {
  
  return 0;
}
class profile{
    private:
      std::string name;
      int age;
      std::string city;
      std::string country;
      std::string pronouns;
      std::string hobbies;
    public:
      void createProfile(){

      }
      std::string getName(){
        return name;
      }
      void setName(std::string new_name){
        name = new_name;
      }
      
  };