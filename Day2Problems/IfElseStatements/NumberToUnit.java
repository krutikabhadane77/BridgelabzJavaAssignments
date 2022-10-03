package IfElseStatements;

import java.util.Scanner;

public class NumberToUnit {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int no = input.nextInt();
        if (no==1)
        {
            System.out.println("unit");
        }
        else if (no==10)
        {
            System.out.println("Ten");
        }
        else if (no==100)
        {
            System.out.println("Ten");
        }
        else if (no==1000)
        {
            System.out.println("Ten");
        }
        else
        {
            System.out.println("Invalid number");
        }
    }
}
