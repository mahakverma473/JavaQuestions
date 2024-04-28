// 36 - Accept a number and check if it is a Harshad number
// Harshad number is a number or an integer which is completely divisible by sum
// of its digits.
// Ex - 24 = Sum of 2+4 = 6 & 24%6 = 0


 import java.util.Scanner;

public class harshadNumber{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("Enter the number to be checked");
        int num=sc.nextInt();
        int digit=num;
        int number,sum=0;

        while(num>0){
           number=num%10;
           sum=sum+number;
           num=num/10;
        }
        if(digit%sum==0){
            System.out.println("Its Harshad number");
        }
        else{
            System.out.println("Its not!");
        }
    }
}

// output
// Enter the number to be checked
// 24
// Its Harshad number