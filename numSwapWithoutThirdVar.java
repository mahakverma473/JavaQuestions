// 18)Accept two numbers from user and swap their values without using third variable 

import java.util.Scanner;

public class numSwapWithoutThirdVar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        System.out.println("Before swapping:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After swapping:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);

    }
}


// Enter the first number:
// 15
// Enter the second number:
// 25
// Before swapping:
// First number: 15
// Second number: 25
// After swapping:
// First number: 25
// Second number: 15

