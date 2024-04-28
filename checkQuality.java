//6)Write a java program to accept two integers and check whether they are equal or not.



import java.util.Scanner;

public class checkQuality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

       
        if (num1 == num2) {
            System.out.println("The two integers are equal.");
        } else {
            System.out.println("The two integers are not equal.");
        }

    }
}

//Enter the first integer:
// 5
// Enter the second integer:
// 5
// The integers are equal.

