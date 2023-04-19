package methodoveriding;

class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    // Method overriding
    public void makeSound() {
        System.out.println("The dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound(); // The animal makes a sound
        
        Dog dog = new Dog();
        dog.makeSound(); // The dog barks
    }
}
