package Day3Problems;

public class SmallestElement {
    public static void main(String args[]) {
        int arr[] = {50, 45, 30, 25, 10};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++)
            if (arr[i] < min)
                min = arr[i];
        System.out.println("Smallest element: " + min);
    }
}
