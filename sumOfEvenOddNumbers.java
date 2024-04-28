// 28 - Print the sum of all even & odd numbers seperately.


import java.util.Scanner;

public class sumOfEvenOddNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }

        System.out.println("Sum of all even numbers up to " + number + ": " + sumEven);
        System.out.println("Sum of all odd numbers up to " + number + ": " + sumOdd);
    }
}

// Enter a number: 27
// Sum of all even numbers up to 27: 196
// Sum of all odd numbers up to 27: 169

