// 8)Write a java program to check whether a given number is positive or negative.


import java.util.Scanner;

public class posiNegCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println(number + " is positive.");
        } else if (number < 0) {
            System.out.println(number + " is negative.");
        } else {
            System.out.println("The number is zero.");
        }

    
    }
}

// Enter a number:
// -8
// -8 is negative.


