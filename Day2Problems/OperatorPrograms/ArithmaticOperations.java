package OperatorPrograms;

import java.util.Scanner;

public class ArithmaticOperations {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int maximum, minimum;
        int p= a + b * c;
        int q= c + a / b;
        int r= a % b + c;
        int s= a * b + c;
        System.out.println("Arithmatic operations results are: "+p+"\n" +q+"\n" +r+"\n" +s);
        
        if (p<q && p<r && p<s)
        {
            minimum=p;
        } else if (q<r && q<s)
        {
            minimum=q;
        } else if (r<s)
        {
            minimum=r;
        }
        else {
            minimum=s;
        }

        if (p>q && p>r && p>s)
        {
            maximum=p;
        } else if (q>r && q>s)
        {
            maximum=q;
        }
        else if (r>s)
        {
            maximum=r;
        }
        else {
            maximum=s;
        }


        System.out.println("The maximum no is: "+maximum);
        System.out.println("The minimum no is: "+minimum);
    }
}