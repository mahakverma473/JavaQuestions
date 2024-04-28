// 12)Write a java program to accept the height of a person in centimeter and
// categorize the person
// according to their height if below 150 he is dwarf if above 150 and below 200
// average and
// above 200 tall.

import java.util.Scanner;

public class HeightCategorization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the height of the person in centimeters:");
        double height = scanner.nextDouble();

        if (height < 150) {
            System.out.println("The person is a dwarf.");
        } else if (height >= 150 && height <= 200) {
            System.out.println("The person is of average height.");
        } else {
            System.out.println("The person is tall.");
        }
    }
}

// Enter the height of the person in centimeters:
// 175
// The person is of average height.
