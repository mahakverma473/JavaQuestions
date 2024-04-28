// 10) Write a java program to read the age of a candidate and determine whether it is eligible
//     for casting his/her own vote.

import java.util.Scanner;

public class voteEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to cast your vote.");
        } else {
            System.out.println("You are not eligible to cast your vote yet.");
        }

    }
}

// Enter your age:
// 22
// You are eligible to cast your vote.
