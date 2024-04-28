
// 21 - Reverse for loop. Print n to 1.



import java.util.Scanner;

public class reverseNumberPrinter {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the value of n
        System.out.print("Enter the value of n: ");
        
        // Read the input integer
        int n = scanner.nextInt();
        
     
        System.out.println("Numbers from " + n + " to 1:");
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }
}

// Enter the value of n: 21
// Numbers from 21 to 1:
// 21
// 20
// 19
// 18
// 17
// 16
// 15
// 14
// 13
// 12
// 11
// 10
// 9
// 8
// 7
// 6
// 5
// 4
// 3
// 2
// 1
