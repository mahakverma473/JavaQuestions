// 20 - Print natural number up to n.in java with output


import java.util.Scanner;

public class naturalNumberPrinter {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the value of n: ");
        
        
        int n = scanner.nextInt();
        
        
        System.out.println("Natural numbers up to " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}


// Enter the value of n: 20
// Natural numbers up to 20:
// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 9
// 10
// 11
// 12
// 13
// 14
// 15
// 16
// 17
// 18
// 19
// 20


