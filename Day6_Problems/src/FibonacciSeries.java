import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        int first=0,second=1,sum=0;
        for (int i=0;i<=n;i++)
        {
            System.out.println(first+ "\n");
            sum=first+second;
            first=second;
            second=sum;
        }
    }
}
