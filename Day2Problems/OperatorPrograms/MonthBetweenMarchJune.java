package OperatorPrograms;

import java.util.Scanner;

public class MonthBetweenMarchJune {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter date: ");
        int date = input.nextInt();
        System.out.println("Enter month: ");
        int month = input.nextInt();
        if (month >= 3 && month <= 6)
            if (month == 3 && date <= 20 || month == 6 && date >= 20) {
                System.out.println("False");
            } else {
                System.out.println("True");
            }
        else {
            System.out.println("False");
        }
    }
}
