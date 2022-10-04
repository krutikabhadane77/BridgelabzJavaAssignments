package Day3Problems;

public class LargestElement {
    public static void main(String args[]) {
        int arr[] = {50, 45, 30, 25, 10};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
        System.out.println("Largest element: " + max);
    }
}
