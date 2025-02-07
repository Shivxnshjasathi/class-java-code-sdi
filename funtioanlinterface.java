@FunctionalInterface
interface Greeting {
    void greet(String message);

}

class funtioanlinterface {
    public static void main(String[] args) {
        Greeting obj = new Greeting() {
            public void greet(String message) {
                System.out.println(message);
            }
        };
        obj.greet("Shivahs");
    }
}
