//7)Write a java program to check whether a given number is even or odd.



import java.util.Scanner;

public class CheckEvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting the number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Checking whether the number is even or odd
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }

        
    }
}

// Enter a number:
// 7
// 7 is odd.

