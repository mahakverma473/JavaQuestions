// 25 - Print all the factors of a number




import java.util.Scanner;

public class factorsPrinter {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
     
        System.out.println("Factors of " + number + ":");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}

// Enter a number: 26
// Factors of 26:
// 1
// 2
// 13
// 26
