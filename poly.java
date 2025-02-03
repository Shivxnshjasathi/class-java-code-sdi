class Dog {
    void says() {
        System.out.println("woof..");
    }
}

class Cat {
    void says() {
        System.out.println("meow..");
    }
}

class poly {
    public static void main(String[] arg) {
        Dog dobj = new Dog();
        Cat cobj = new Cat();
        dobj.says();
        cobj.says();
    }
}
