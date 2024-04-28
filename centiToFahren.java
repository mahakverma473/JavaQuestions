//4)Write a program that converts Centigrade to Fahrenheit.


import java.util.Scanner;

public class centiToFahren {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter temperature in Centigrade
        System.out.print("Enter temperature in Centigrade: ");
        double centigrade = scanner.nextDouble();

        // Convert Centigrade to Fahrenheit
        double fahrenheit = (centigrade * 9 / 5) + 32;

        // Display the temperature in Fahrenheit
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        
    }
}

// Enter temperature in Centigrade: 25
// Temperature in Fahrenheit: 77.0