abstract class Animal {
    abstract void makeSound();
    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks: Woof woof!");
    }
}
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat Says: meow meow!");
    }
}

class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound();
        myDog.sleep();
        Cat myCat = new Cat();
        myCat.makeSound();
    }
}
