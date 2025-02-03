import java.util.*;
class Student implements Comparable<Student> {
    String name;
    int marks;
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    @Override
    public int compareTo(Student s) {
        return Integer.compare(this.marks, s.marks);
    }
    @Override
    public String toString() {
        return name + " (" + marks + ")";
    }
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 90));
        students.add(new Student("Bob", 85));
        students.add(new Student("Charlie", 95));
        
        Collections.sort(students);
        System.out.println("Sorted Students: " + students);
    }
}
