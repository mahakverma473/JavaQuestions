// 11)	Write a java program to read the value of an integer m and display the value of n is 1 when m is 
//    larger than 0, 0 when m is 0 and -1 when m is less than 0.

import java.util.Scanner;

public class valueOfN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of m:");
        int m = scanner.nextInt();
        int n;

        if (m > 0) {
            n = 1;
        } else if (m == 0) {
            n = 0;
        } else {
            n = -1;
        }

        System.out.println("The value of n is: " + n);

       
    }
}

// Enter the value of m:
// -5
// The value of n is: -1
