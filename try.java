// import java.util.Scanner;
// class test {
//     public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in); 
//         System.out.print("Enter a number: ");
//         int input = sc.nextInt();
        
//         if (input % 5 == 0 && input % 11 == 0) {
//             System.out.println("Divisible by both 5 and 11");
//         } else if (input % 5 == 0) {
//             System.out.println("Divisible by 5");
//         } else if (input % 11 == 0) {
//             System.out.println("Divisible by 11");
//         } else {
//             System.out.println("Not divisible by 5 or 11");
//         }
//         sc.close();
//     }
// }

import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next(); 
        int flag = 0;
        boolean isValid = true;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'b') {
                flag = 1; 
            }
            if (input.charAt(i) == 'a' && flag == 1) {
                isValid = false; 
                break; 
            }
        }
        if (isValid) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        sc.close(); 
    }
}
