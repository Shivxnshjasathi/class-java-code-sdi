
interface Animal {
    void makeSound();
}

interface Legs extends Animal {
    void countLegs();
}

class Dog implements Animal, Legs {
    @Override
    public void makeSound() {
        System.out.println("Dog barks: Woof woof!");
    }

    @Override
    public void countLegs() {
        System.out.println("A dog has 4 legs.");
    }
}

class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound();
        myDog.countLegs();
    }
}
