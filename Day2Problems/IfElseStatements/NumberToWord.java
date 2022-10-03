package IfElseStatements;

import java.util.Scanner;

public class NumberToWord {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter any single digit no: ");
        String[] array={"zero","one","two","three","four","five","six","seven","eight","nine"};
        int no=input.nextInt();
        if (no<10)
        {
            System.out.println("Entered no is "+array[no]);
            no=input.nextInt();
        }
        else {
            System.out.println("Not a single digit no");
        }
    }
}
