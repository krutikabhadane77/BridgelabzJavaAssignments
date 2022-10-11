//Java program to find the Largest Among Three Numbers.

package Day5Problems;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int no1 = sc.nextInt();
        int no2 = sc.nextInt();
        int no3 = sc.nextInt();

        if (no1>=no2 && no1>=no3)
            System.out.println(no1+ " is the largest number");
        else if (no2>=no1 && no2>=no3)
            System.out.println(no2+ " is the largest number");
        else
            System.out.println(no3+ " is the largest number");

        }
    }
