//Java program to swap two numbers.

package Day5Problems;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int no1 = sc.nextInt();
        int no2 = sc.nextInt();
        System.out.println("Before swapping numbers : " + no1 + " " + no2);

        //Swapping
        temp = no1;
        no1 = no2;
        no2 = temp;
        System.out.println("After swapping numbers : " + no1 + " " + no2);
    }
}
