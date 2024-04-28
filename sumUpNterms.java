// 23 - Sum up to n terms.in java with output and class should be sumUpNterms



import java.util.Scanner;

public class sumUpNterms {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
      
        System.out.print("Enter the value of n: ");
        
        
        int n = scanner.nextInt();
        
       
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum up to " + n + " terms: " + sum);
    }
}

// Enter the value of n: 23
// Sum up to 23 terms: 276


