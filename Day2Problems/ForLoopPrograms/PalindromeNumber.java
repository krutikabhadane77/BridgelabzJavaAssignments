package ForLoopPrograms;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String args[])
    {
        int temp,sum,rem;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter no: ");
        int no = input.nextInt();
        temp=no;
        for(sum=0;no>0;no/=10)
        {
            rem=no%10;
            sum=(sum*10)+rem;
        }
        if (sum==temp)
        {
            System.out.println("No is palindrome");
        }
        else
        {
            System.out.println("No is not palindrome");
        }
    }
}
