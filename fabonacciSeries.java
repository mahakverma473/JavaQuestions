// 37 - Fibonacci series - 0, 1, 1, 2, 3, 5, 8, 13, 21...

import java.util.*;

public class fabonacciSeries {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Range");
        int num = sc.nextInt();
        int first = 0;
        int next = 0;
        int second = 1;
        
        System.out.print("The series is: \n"+first + " , " + second + " , ");

        for (int i = 3; i <= num; i++) {
            next = first + second;
            if (i < num) {
                System.out.print(next + " , ");
            } else {
                System.out.print(next);
            }
            first = second;
            second = next;
        }
    }
}

// output
// Enter Range
// 9
// The series is: 
// 0 , 1 , 1 , 2 , 3 , 5 , 8 , 13 , 21

