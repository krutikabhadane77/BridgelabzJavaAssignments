package Day3Problems;

public class OddPosition {
    public static void main(String args[]){
        int arr[]={5,4,3,2,1};
        System.out.println("Array elements are present in odd position ");
        for (int i=0;i< arr.length;i=i+2)
            System.out.println(+arr[i]);
    }
}
