import java.util.Scanner;

// class arr {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of elements in the array:");
//         int n = sc.nextInt();
//         if (n <= 0) {
//             System.out.println("Array size must be greater than 0.");
//             sc.close();
//             return;
//         }
//         int[] a = new int[n];
//         for (int i = 0; i < n; i++) {
//             System.out.println("Enter element " + (i + 1) + ":");
//             a[i] = sc.nextInt();
//         }
//         System.out.println("enter the elment u want to find :");
//         int k = sc.nextInt();
//         int flag = 0;
//         for (int element : a) {
//             // if (element < 2){
//             // continue;
//             // }
//             if (element == k) {
//                 // System.out.println(element + " Found");
//                 flag = 1;
//                 break;
//             }
//             // System.out.println(element);
//         }
//         if (flag == 1) {
//             System.out.println("Found");
//         } else {
//             System.out.println("not Found");
//         }
//         sc.close();
//     }
// }
class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] numbers = new int[2][3];
        System.out.println("Enter 6 elements:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                numbers[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("2D Array:");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
