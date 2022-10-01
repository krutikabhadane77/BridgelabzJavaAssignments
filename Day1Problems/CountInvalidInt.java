package Day1Problems;

public class CountInvalidInt {
    public static void main(String[] Values) {
        int sum = 0;
        System.out.println("Calculates sum of valid integers");
        for (int i = 0; i < Values.length; i++) {
            System.out.println(Values[i]);
            sum = sum + Integer.parseInt(Values[i]);
        }
        System.out.println("Sum of valid integers: " + sum);
    }
}