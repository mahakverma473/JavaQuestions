

// 25 - Print all the numbers which are either divisible by 3 or 5 in a range


import java.util.Scanner;

public class divisibleBy3Or5 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();
        
        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();
        
        
        System.out.println("Numbers divisible by either 3 or 5 within the range " + start + " to " + end + ":");
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}

// Enter the start of the range: 1
// Enter the end of the range: 25
// Numbers divisible by either 3 or 5 within the range 1 to 25:
// 3
// 5
// 6
// 9
// 10
// 12
// 15
// 18
// 20
// 21
// 24

