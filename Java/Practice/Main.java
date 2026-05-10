package Java.Practice;
import java.util.*;

public class Main {

        // 1. Abstract Class (The "Idea")
    abstract class Animal {
        // Abstract method: it has no body! It's just a requirement.
        public abstract void makeNoise();

        // Regular method: Animals also sleep, and they all do it the same way.
        public void sleep() {
            System.out.println("Zzz...");
        }
    }

    // 2. Concrete Class (The "Implementation")
    class Dog extends Animal {
        public void makeNoise() {
            System.out.println("Bark! Bark!");
        }
    }

    class Cat extends Animal {
        public void makeNoise() {
            System.out.println("Meow!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main main = new Main();


        while (true) {
            String choice;
            if (choice == null || choice.equalsIgnoreCase("exit")) {
                System.out.print("Choose an animal (dog/cat): ");
                choice = sc.nextLine();
                Animal myAnimal;
                if (choice.equalsIgnoreCase("dog")) {
                    myAnimal = main.new Dog(); // Create a Dog instance
                } else if (choice.equalsIgnoreCase("cat")) {
                    myAnimal = main.new Cat(); // Create a Cat instance
                } else {
                    System.out.println("Invalid choice. Defaulting to Dog.");
                    myAnimal = main.new Dog();
                }
                myAnimal.makeNoise();
                myAnimal.sleep();
            } else {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }
        }
        sc.close();
    }
}
