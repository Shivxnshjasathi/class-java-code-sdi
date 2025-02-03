import java.util.Scanner;
class Switch{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ");
        String day = scanner.next();
        String dayName;
        switch (day) {
            case "Sunday" :
                dayName = "First day";
                break;
            case "Monday":
                dayName = "Second day";
                break;
            case "Tuesday":
                dayName = "Third day";
                break;
            case "Wednesday":
                dayName = "Forth day";
                break;
            case "Thursday":
                dayName = "Fith day";
                break;
            case "Friday":
                dayName = "Sixth day";
                break;
            case "Saturday":
                dayName = "Seventh day";
                break;
            default:
                dayName = "Inalid day";
        }

        System.out.println("Day: " + dayName);
        scanner.close();
    }
}
