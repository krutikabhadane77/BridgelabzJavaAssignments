package Day3Problems;

public class EvenPosition {
    public static void main(String args[]){
        int arr[]={5,4,3,2,1};
        System.out.println("Array elements are present in even position ");
        for (int i=1;i< arr.length;i=i+2)
            System.out.println(arr[i]);
    }

}
