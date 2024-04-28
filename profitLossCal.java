// 16)Write a java program to calculate profit and loss on a transaction accept cost price and 
//    selling price.

import java.util.Scanner;

public class profitLossCal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the cost price:");
        double costPrice = scanner.nextDouble();

        System.out.println("Enter the selling price:");
        double sellingPrice = scanner.nextDouble();

        double profitOrLoss = sellingPrice - costPrice;

        if (profitOrLoss > 0) {
            System.out.println("Profit: $" + profitOrLoss);
        } else if (profitOrLoss < 0) {
            System.out.println("Loss: $" + (-profitOrLoss));
        } else {
            System.out.println("No profit, no loss.");
        }

        
    }
}

// Enter the cost price:
// 100
// Enter the selling price:
// 120
// Profit: $20.0
