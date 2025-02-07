@FunctionalInterface
interface Greeting {
    void greet(String message);

}

class funtioanlinterface {
    public static void main(String[] args) {
        // funtional interface
        Greeting obj = new Greeting() {
            public void greet(String message) {
                System.out.println(message);
            }
        };
        obj.greet("Shivansh");
        // lamda
        Greeting obj2 = (String message) -> System.out.println(message);
        obj2.greet("lambda");

    }
}
// 2 parameters

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

class FunctionalInterfaceExample {
    public static void main(String[] args) {
        // Using anonymous class
        MathOperation addition = new MathOperation() {
            public int operate(int a, int b) {
                return a + b;
            }
        };
        System.out.println("Addition (Anonymous Class): " + addition.operate(5, 3));

        // Using Lambda Expression
        MathOperation additionLambda = (a, b) -> {
            System.out.println(
                    "the answer is");
            return a + b;
        };
        System.out.println("Addition (Lambda): " + additionLambda.operate(10, 7));
    }
}
