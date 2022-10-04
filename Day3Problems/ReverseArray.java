package Day3Problems;

public class ReverseArray {
    public static void main(String args[])
    {
        int arr[]={50,45,30,25,10};
        System.out.println("Array elements in reverse order ");
        for (int i= arr.length-1;i>=0;i--)
        {
            System.out.println(arr[i]+" ");
        }
    }
}
