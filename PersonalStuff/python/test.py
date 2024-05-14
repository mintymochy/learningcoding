x = "meow"  # string
y1 = 5  # int
y2 = 5.0  # float not double
z1 = bool(0)  # false
z2 = bool(1)  # true
print(y1)
# user input example
username = input("Enter username:")
print("Username is: " + username)
if y1 == 4:
    print("meow")
elif y1 == 3:
    print("erm")


class Meow:
    def __init__(self) -> None:
        pass


class Geek:
    def __init__(self, age=0):
        self._age = age

    # getter method
    def get_age(self):
        return self._age

    # setter method
    def set_age(self, x):
        self._age = x
