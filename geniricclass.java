class Box<K, V> {
    private K key;
    private V value;

    void setValues(K key, V value) {
        this.key = key;
        this.value = value;
    }

    K getKey() {
        return this.key;
    }

    V getValue() {
        return this.value;
    }
}

class GenericClass {
    public static void main(String[] args) {
        Box<Integer, String> obj = new Box<>();
        obj.setValues(1, "Hello");
        System.out.println("Key: " + obj.getKey() + ", Value: " + obj.getValue());
        Box<String, Double> obj1 = new Box<>();
        obj1.setValues("Price", 99.99);
        System.out.println("Key: " + obj1.getKey() + ", Value: " + obj1.getValue());
    }
}
