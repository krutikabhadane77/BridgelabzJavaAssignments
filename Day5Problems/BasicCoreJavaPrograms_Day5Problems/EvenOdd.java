//Java program to check whether a number is Even or Odd.
package Day5Problems;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int no1 = sc.nextInt();

        if (no1 % 2 == 0)
            System.out.println(no1 + " is even");
        else
            System.out.println(no1 + " is odd");
    }
}
