class PClass {
    public int i = 100;

    public void show() {
        System.out.println("hello P");
    }
}

class CClass extends PClass {
    public int i = 200; 

    @Override
    public void show() {
        System.out.println("hello C");
    }
}
class HelloWorld {
    public static void main(String[] args) {
        PClass pobj = new CClass();
        System.out.println(pobj.i);
    }
}
