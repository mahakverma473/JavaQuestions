//3)Write a program in java that takes minutes as input, and display the total number of hours and
//minutes.


import java.util.Scanner;

public class TotalHoursAndMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter minutes
        System.out.print("Input minutes: ");
        int totalMinutes = scanner.nextInt();

        // Calculate hours and remaining minutes
        int hours = totalMinutes / 60;
        int remainingMinutes = totalMinutes % 60;

        // Display the total hours and minutes
        System.out.println(hours + " Hours, " + remainingMinutes + " Minutes");

        
    }
}
//Expected Output :
// Input hours: 5
// Input minutes: 37
// Total: 337 minutes.


