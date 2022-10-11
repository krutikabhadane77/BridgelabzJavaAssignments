/*1. Flip Coin and print percentage of Heads and Tails
a. I/P -> The number of times to Flip Coin. Ensure it is a positive integer.
b. Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or heads
c. O/P -> Percentage of Head vs Tails*/

package Day5Problems;
import java.util.Scanner;
public class FlipCoin {
    public static void main(String[] args) {
        int no, head_count = 0, tail_count = 0;
        double heads, tails;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of times you want to flipping coin: ");
        no = sc.nextInt();

        for (int j = 0; j < no; j++) {
            double random = Math.random();
            if (random < 0.5)
                head_count++;
            else
                tail_count++;
        }
        heads = head_count / (double) no * 100;
        tails = tail_count / (double) no * 100;
        System.out.println("Percentage of heads: " + heads + "%");
        System.out.println("Percentage of tails: " + tails + "%");
    }
}
