// 17)Accept two numbers from user and swap their values



import java.util.Scanner;

public class numberSwap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        System.out.println("Before swapping:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);

        // Swap the values
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After swapping:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);

    
    }
}

// Enter the first number:
// 10
// Enter the second number:
// 20
// Before swapping:
// First number: 10
// Second number: 20
// After swapping:
// First number: 20
// Second number: 10
