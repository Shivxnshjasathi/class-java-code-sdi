
// class loop{
//     static public void main(String []arg){
//         for(int i = 0 ; i < 50 ; i = i+5){
//             System.out.println(i);
//         }
//     }
// }
import java.util.Scanner;

class loop {
    static public void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
        while (nums <= 1 || nums >= 10) {
            System.out.println("plz anter num");
            nums = sc.nextInt();
        }
        System.out.println("loop out");
    }
}