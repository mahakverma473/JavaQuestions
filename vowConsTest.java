
// 15) Write a java program to check whether an alphabet is a vowel or consonant.



import java.util.Scanner;

public class  vowConsTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an alphabet:");
        char alphabet = scanner.next().charAt(0);

        // Convert to lowercase to simplify comparisons
        alphabet = Character.toLowerCase(alphabet);

        if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u') {
            System.out.println(alphabet + " is a vowel.");
        } else {
            System.out.println(alphabet + " is a consonant.");
        }
    }
}

// Enter an alphabet:
// e
// e is a vowel.

