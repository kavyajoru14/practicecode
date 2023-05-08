package Inheritence;

public class Animal {
	public void speak() {
        System.out.println("Animal speaks");
    }
}

class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("Woof!");
    }

    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.speak(); 
    }
}


	




