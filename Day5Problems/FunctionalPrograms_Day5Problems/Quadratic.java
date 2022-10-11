/*Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation can be found using a formula delta = b*b - 4*a*c
Root 1 of x = (-b + sqrt(delta))/(2*a)
Root 2 of x = (-b - sqrt(delta))/(2*a)*/
package FunctionalPrograms_Day5Problems;
import java.util.Scanner;
public class Quadratic {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of a: ");
        int a = input.nextInt();
        System.out.println("Enter value of b: ");
        int b = input.nextInt();
        System.out.println("Enter value of c: ");
        int c = input.nextInt();
        input.close();
        int delta=b*b-4*a*c;
        System.out.println("Eqaution is:a*x*x+b*x+c"+"\n");
        double x1=(-b+((double)Math.sqrt(delta)))/(2*a);
        double x2=(-b-((double)Math.sqrt(delta)))/(2*a);
        System.out.println("Roots of x are: ");
        System.out.print("x1: "+x1);
        System.out.print("x2: "+x2);
    }
}
