package Unit_9;

/*
 04-01-2024
 augustjones
 :3
 */
public class example {
    class Animal {
        public void animalSound() {
            System.out.println("The animal makes a sound");
        }
    }

    class Cat extends Animal {
        public void animalSound() {
            System.out.println("The cat says: meow meow");
        }
    }

    class Dog extends Animal {
        public void animalSound() {
            System.out.println("The dog says: bow wow");
        }
    }

    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // Create a Animal object
        Animal myPig = new Cat(); // Create a Pig object
        Animal myDog = new Dog(); // Create a Dog object
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }

}
