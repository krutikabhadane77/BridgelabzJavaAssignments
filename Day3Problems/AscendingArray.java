package Day3Problems;

public class AscendingArray {
    public static void main(String args[])
    {
        int arr[] = {8,4,9,3,7,5,2,6,1};
        int temp=0;
        for (int i=0;i<arr.length;i++)
            for (int j=i+1;j<arr.length;j++)
                if (arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
        System.out.println();
        System.out.println("Array Elements sorted in ascending order ");
        for (int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }
}
