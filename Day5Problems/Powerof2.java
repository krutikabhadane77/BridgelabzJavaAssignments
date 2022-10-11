/*
Power of 2
a. Desc -> This program takes a command-line argument N and prints a table of the
powers of 2 that are less than or equal to 2^N.
b. I/P -> The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows an int
c. Logic -> repeat until i equals N.
d. O/P -> Print the year is a Leap Year or not.
 */
package Day5Problems;

public class Powerof2 {
    public static void main(String[] args) {
        int num, result = 1;
        // Data input through command line
        num = Integer.parseInt(args[0]);
        // Check condition
        if (num > 31) {
            System.out.println("value of number should be less than 31");
            return;
        }

        // Cmputation
        else {
            System.out.println(result);
            for (int j = 1; j <= num; j++) {
                result = result * 2;
                System.out.println(result);
            }
        }

    }
}
