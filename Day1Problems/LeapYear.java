package Day1Problems;

import java.util.Scanner;

public class LeapYear {
    public static void main(String args[])
    {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter year: ");
        int year=input.nextInt();
        if (year<1582 && year%4==0)
        {
            System.out.println(year+ "is a leap year");
        } else if (year<1582)
        {
            System.out.println(year+ "is not leap year");
        } else if (year>=1582 && (year % 4==0 && (year % 100!=0 || year % 400==0)))
        {
            System.out.println(year+ "is a leap year");
        }
        else
        {
            System.out.println(year+ "is not leap year");
        }
    }
}
