// 34 -  Accept a number and check if it a perfect number or not.
//       A number whose sum of factors(excluding number itself)  = Number 
//       Ex -  6 = 1, 2, 3 = 6

import java.util.Scanner;

public class perfectNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be checked");
        int num = sc.nextInt();

        int sum = 0;
        int number = num;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;

            }
        }
        if (sum == number) {
            System.out.println("ITS A PERFECT NUMBER");
        } else {
            System.out.println("ITS NOT!");
        }

    }
}
// output
// Enter the number to be checked
// 6
// ITS A PERFECT NUMBER