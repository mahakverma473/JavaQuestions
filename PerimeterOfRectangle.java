//1) Write a java program that prints the perimeter of a rectangle to take its height and width as input

import java.util.Scanner;

public class PerimeterOfRectangle{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input height of the rectangle
        System.out.print("Enter the height of the rectangle: ");
        double height = scanner.nextDouble();

        // Input width of the rectangle
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        // Calculate perimeter
        double perimeter = 2 * (height + width);

        // Print the perimeter
        System.out.println("The perimeter of the rectangle is: " + perimeter);

    }
}
// Enter the height of the rectangle: 5
// Enter the width of the rectangle: 7
// The perimeter of the rectangle is: 24.0

