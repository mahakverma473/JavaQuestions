//19)  Accept an integer and Print hello world n times in java

import java.util.Scanner;

public class HelloWorldPrinter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of times to print 'hello world': ");

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("hello world");
        }
    }
}

//output
// Enter the number of times to print 'hello world': 19
// hello world
// hello world
// hello world
// hello world
// hello world
// hello world
// hello world
// hello world
// hello world
// hello world
// hello world
// hello world
// hello world
// hello world
// hello world
// hello world
// hello world
// hello world
// hello world
