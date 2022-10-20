import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int rev = 0, rem;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int no = input.nextInt();
        prime(no);
    }
    public static void prime(int no)
    {
        boolean bool=false;
        for (int i=2;i<=no/2;i++)
        {
            if (no%i==0)
            {
                bool=true;
                break;
            }
        }
        if (!bool)
        {
            System.out.println(no + " is prime number");
        }
        else
            System.out.println(no + " is perfect number");
    }
}
