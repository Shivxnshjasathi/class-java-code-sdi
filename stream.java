import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.IntStream;

class StreamExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Shivansh", "Amit", "Rahul", "Priya", "Ananya", "Suresh");
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println("Names starting with 'A': " + filteredNames);
    }
}

class EvenNumbersFilter {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 15, 22, 35, 40, 50, 67, 80, 95);
        List<Integer> evenNumbers = numbers.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even Numbers: " + evenNumbers);
    }
}

class StreamMapExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Shivansh", "Amit", "Rahul", "Priya", "Ananya", "Suresh");
        List<Integer> Names = names.stream()
                .map(String::length).collect(Collectors.toList());
        System.out.println("Names length: " + Names);
    }
}

class FactorialStream {
    public static void main(String[] args) {
        int num = 5;
        long factorial = LongStream.rangeClosed(1, num)
                .reduce(1, (a, b) -> a * b);
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}

class FactorialWithStreams {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 4, 5);
        List<Integer> factorials = numbers.stream()
                .map(n -> IntStream.rangeClosed(1, n)
                        .reduce(1, (a, b) -> a * b))
                .toList();
        System.out.println("Factorials: " + factorials);
    }
}


class ReduceExample {
    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25);
        int sum = numbers.stream()
                         .reduce(0, (a, b) -> a + b); 
        System.out.println("Sum of numbers: " + sum);
    }
}


class SortedExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 4);
        List<Integer> ascending = numbers.stream()
                                         .sorted()
                                         .collect(Collectors.toList());   
        List<Integer> descending = numbers.stream()
                                          .sorted((a, b) -> b - a) 
                                          .collect(Collectors.toList());

        System.out.println("Ascending Order: " + ascending);
        System.out.println("Descending Order: " + descending);
    }
}

