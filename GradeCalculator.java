// 14)accept marks of 4 subjects and calculate percentage if percentage is below 35% - F
//    below 45% - D below 55% - C below 75% - B above 75% - A 

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks of four subjects:");

        int subject1 = scanner.nextInt();
        int subject2 = scanner.nextInt();
        int subject3 = scanner.nextInt();
        int subject4 = scanner.nextInt();

        int totalMarks = subject1 + subject2 + subject3 + subject4;

        double percentage = (double) totalMarks / 4;

        char grade;
        if (percentage >= 75) {
            grade = 'A';
        } else if (percentage >= 55) {
            grade = 'B';
        } else if (percentage >= 45) {
            grade = 'C';
        } else if (percentage >= 35) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        
    }
}

// Enter marks of four subjects:
// 85
// 75
// 90
// 80
// Percentage: 82.5%
// Grade: A
