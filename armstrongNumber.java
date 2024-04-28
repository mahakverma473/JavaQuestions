// 33-check wheather the given number id Armstrong number or not


import java.util.Scanner;

public class armstrongNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be checked");
        int num = sc.nextInt();

        int sum = 0;
        int number = num;

        while(num!=0){
            int aNum=num%10;
            sum=sum+(aNum*aNum*aNum);
            num=num/10;
        }
        if(sum==number){
            System.out.println("ARMSTRONG NUMBER:"+number);
        }
        else{
           System.out.println ("its not!");
        }
    }
}

//output
// Enter the number to be checked
// 143
// its not!
// Enter the number to be checked
// 407
// ARMSTRONG NUMBER:407