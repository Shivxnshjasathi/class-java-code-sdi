import java.util.Scanner;

class Employee {
    int eno;
    String ename;

    Employee(int id, String n) {
        eno = id;
        ename = n;
    }

}

class oop {
    static public void main(String[] arg) {
        Employee e1 = new Employee(20, "Shivansh");
        // Employee e1 = new Employee();
        // e1.ename = "Vedant";
        // Employee e2 = new Employee();
        // e2.eno = 100;
        System.out.println(String.format("employee number : %s,employee name : %s", e1.eno, e1.ename));
        // System.out.println(String.format("employee number : %s,employee name : %s",
        // e2.eno,e2.ename));
        // e2.eno = 200;
        // System.out.println(String.format("employee number : %s,employee name : %s",
        // e1.eno,e1.ename));
        // System.out.println(String.format("employee number : %s,employee name : %s",
        // e2.eno,e2.ename));

    }
}

// class sum {
//     int add(int i, int j) {
//         int r = i + j;
//         return r;
//     }

//     float add(float i, float j) {
//         float r = i + j;
//         return r;
//     }

//     int avrage(int i, int j) {
//         int a = (i + j) / 2;
//         return a;
//     }

// }

// class oop {
//     public static void main(String[] arg) {
//         sum obj = new sum();
//         int result = obj.add(200, 100);
//         float result2 = obj.add(200.56f, 100.66f);
//         int avg = obj.avrage(200, 100);
//         System.out.println(result);
//         System.out.println(result2);
//         System.out.println(avg);
//     }
// }

// class str {
//     String plus(String fn, String ln) {
//         String fullname = fn + " " + ln;
//         return fullname;
//     }
// }

// class oop {
//     public static void main(String[] arg) {
//         str obj = new str();
//         String output = obj.plus("Shivansh", "jasathi");
//         System.out.println(output);
//     }
// }