// 24 - Factorial of a number in java with output



import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a number: ");
        
     
        int number = scanner.nextInt();
        
        
        long factorial = calculateFactorial(number);
        
       
        System.out.println("Factorial of " + number + " is: " + factorial);
        
    }
    
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}

// Enter a number: 24
// Factorial of 24 is: 620448401733239439360000
