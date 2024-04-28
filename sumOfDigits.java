// 29 - Sum of digits of a number, 936 = 18


import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
       
        int sum = 0;
        int temp = number;
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        
      
        System.out.println("Sum of digits of " + number + ": " + sum);
    }
}

// Enter a number: 936
// Sum of digits of 936: 18


