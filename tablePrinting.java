// 22 - Take a number as input and print its table
//        5 * 1 = 5
//        5 * 2 = 10 ... up to 10 termm in java with output



import java.util.Scanner;

public class tablePrinting {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
      
        System.out.print("Enter a number: ");
        
        
        int number = scanner.nextInt();
        
       
        System.out.println("Multiplication table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }
    }
}

// Enter a number: 5
// Multiplication table for 5:
// 5 * 1 = 5
// 5 * 2 = 10
// 5 * 3 = 15
// 5 * 4 = 20
// 5 * 5 = 25
// 5 * 6 = 30
// 5 * 7 = 35
// 5 * 8 = 40
// 5 * 9 = 45
// 5 * 10 = 50


