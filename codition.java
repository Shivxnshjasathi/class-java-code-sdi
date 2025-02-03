// import java.util.Scanner;

// class Condition {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in); 
//         System.out.println("Enter a year:");
//         int year = sc.nextInt(); 
//         if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) { 
//             System.out.println("leap year....");
//         } else {
//             System.out.println("Not a leap year Goodbye....");
//         }
//     }
// }


import java.util.Scanner;
class Condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a team1 scrore:");
        int team1 = sc.nextInt(); 
        System.out.println("Enter a team2 scrore:");
        int team2 = sc.nextInt();
        System.out.println("Enter a team3 scrore:");
        int team3 = sc.nextInt();
        // if (team1 > team2 && team2 > team3) { 
        //     System.out.println("team1 ");
        // }
        // if (team2 > team3 && team3 > team1) { 
        //     System.out.println("team2");
        // }
        //  else {
        //     System.out.println("team3");
        // }

        if (team1 > team2){
            if (team1 > team3){
                System.out.println("team1");
            }
            else{
                System.out.println("team3");
            }
        }
        else{
            if (team2 > team1){
                System.out.println("team2");
            }
            else{
                System.out.println("team1");
            }
        }
    }
}
