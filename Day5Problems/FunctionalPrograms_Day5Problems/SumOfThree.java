/*Sum of three Integer adds to ZERO
a. Desc -> A program with cubic running time. Read in N integers and counts the
number of triples that sum to exactly 0.
b. I/P -> N number of integer, and N integer input array
c. Logic -> Find distinct triples (i, j, k) such that a[i] + a[j] + a[k] = 0
d. O/P -> One Output is number of distinct triplets as well as the second output is to
print the distinct triplets.*/
package FunctionalPrograms_Day5Problems;

import java.util.Scanner;

public class SumOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int no = sc.nextInt();
        int[] arr = new int[no];
        System.out.println("Enter the numbers : ");
        for (int i = 0; i < no; i++) {
            arr[i] = sc.nextInt();
        }
        int distinct_count = 0;
        for (int i = 0; i < no - 2; i++)
            for (int j = i + 1; j < no - 1; j++)
                for (int k = j + 1; k < no; k++)

                    if ((arr[i] + arr[j] + arr[k]) == 0) {
                        distinct_count++;
                        System.out.println("(" + arr[i] + "," + arr[j] + "," + arr[k] + ")");
                    }
        System.out.println("Total distinct triplets : " + distinct_count);
    }
}
