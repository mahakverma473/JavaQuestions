// 35 - Accept a number and check if it is a strong number or not (Sum of factorial of each digit)
//        Ex- 145 = 1! + 4! + 5! = 145


import java.util.Scanner;
public class strongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be checked");
        int num = sc.nextInt();
        int sum = 0;
        int number = num;
        while(num!=0){
            int digit = num % 10; 
            int fact=1;
            for (int i = 1; i <= digit; i++) {
                fact = fact*i;
            }
            sum = sum+fact;

            num = num / 10;
        }
        if(number==sum){
            System.out.println("ITS STRONG NUMBER");
        }
        else{
            System.out.println("ITS NOT!");
        }
    }
}

// output
// Enter the number to be checked
// 145
// ITS STRONG NUMBER