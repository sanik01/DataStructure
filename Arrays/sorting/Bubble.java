package sorting;

public class Bubble {
    // Bubble sort is a sorting algorithm that compares two adjacent elements and swaps them until they are in the intended order.
    public static void main(String[] args) {
        int arr[] = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int n = arr.length;

        for(int idx =0;idx<n;idx++){
            for(int j =idx+1;j<n;j++){
                if(arr[idx]>arr[j]){
                    int temp=arr[idx];
                     arr[idx]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.println(arr[idx] +" " );
        }
       
       
    }
}
