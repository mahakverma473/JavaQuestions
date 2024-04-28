//5) Write a java program that converts kilometers per hour to miles per hour.


import java.util.Scanner;

public class KilometersToMiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter speed in kilometers per hour
        System.out.print("Enter speed in kilometers per hour: ");
        double kmPerHour = scanner.nextDouble();

        // Convert kilometers per hour to miles per hour
        double milesPerHour = kmPerHour * 0.621371;

        // Display the speed in miles per hour
        System.out.println("Speed in miles per hour: " + milesPerHour);

       
    }
}

//Enter speed in kilometers per hour: 100
//Speed in miles per hour: 62.1371

