package WhileLoopPrograms;

import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String args[]) {
        int i=1, sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter no: ");
        int no = input.nextInt();
        while (i <= no) {
            sum = sum + i;
            i++;
        }
        System.out.println("Sum of natural no is: " + sum);
    }
}
