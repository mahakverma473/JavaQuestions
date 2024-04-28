//2)Write a java program that takes hours and minutes as input, and calculates the total number 


import java.util.Scanner;

public class MinutesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter hours
        System.out.print("Input hours: ");
        int hours = scanner.nextInt();

        // Prompt the user to enter minutes
        System.out.print("Input minutes: ");
        int minutes = scanner.nextInt();

        // Calculate the total minutes
        int totalMinutes = hours * 60 + minutes;

        // Display the total minutes
        System.out.println("Total: " + totalMinutes + " minutes.");

      
    }
}
// Expected Output :
//   Input minutes: 546
//   9 Hours, 6 Minutes
