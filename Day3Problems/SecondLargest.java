package Day3Problems;

public class SecondLargest {
    public static void main(String args[]) {
        int arr[] = {50, 45, 30, 25, 10};
        int temp, size;
        size = arr.length;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Second largest no is " + arr[size - 2]);
    }
}
