//40 - Write a program in java to find the sum of the series 1 +11 + 111 + 1111 + .. n terms.



import java.util.*;
public class seriesSum72
{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Size");
        int size=sc.nextInt();
        int []arr=new int[size];
        Print(arr);
    }
    public static void Print(int[]arr){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Array elements");
        for(int i=0;i<arr.length;i++){
           arr[i]=sc.nextInt();
        }
     Reprint(arr);
    }
    public static void Reprint(int[]arr){
        System.out.println("Reprinting array Elements");
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
        }
    }
}

//output


