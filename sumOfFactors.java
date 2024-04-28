// 27 - Print the sum of all factors of a number, 50 - 1 + 2 + 5 + 10 + 25 = 43

import java.util.Scanner;

public class sumOfFactors {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        System.out.println("Sum of all factors of " + number + ": " + sum);
    }
}


// Enter a number: 27
// Sum of all factors of 27: 40
