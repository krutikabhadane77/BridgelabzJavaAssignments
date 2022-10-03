package ForLoopPrograms;

import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String args[]) {
        int i, sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter no: ");
        int no = input.nextInt();
        for (i=1;i<=no;++i)
        {
            sum=sum+i;
        }
        System.out.println("Sum of natural no is: " + sum);
    }
}
