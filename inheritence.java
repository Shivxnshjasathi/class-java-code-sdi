class A {
    int i = 100;
}

class B extends A {
    int i = 200;

    void show(int i) {
        System.out.println(i); // 50
        System.out.println(this.i);// 100
        System.out.println(super.i);// 200
    }
}

class test {
    public static void main(String[] arg) {
        B obj = new B();
        obj.show(50);
        System.out.println(obj.i);

        A obj1 = new B();
        System.out.println(obj1.i);

    }
}