package ForLoopPrograms;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String args[]) {
        int rev = 0, rem;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter no: ");
        int no = input.nextInt();
        for (;no!=0;no=no/10)
        {
            rem = no % 10;
            rev = rev * 10 + rem;
        }
        System.out.println("The reverse no is: " + rev);
    }
}
