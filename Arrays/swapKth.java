public class swapKth {
    public static void main(String[]args){
        int arr[] = { 2,4,5,6,8,1};
        int n = arr.length;
        int k = 2;
        //output=2,8,5,4,1
        int temp = arr[k-1];
        arr[k-1]= arr[n-k];
        arr[n-k]= temp;
        for(int idx =0; idx<n;idx++){
            System.out.print(arr[idx] +" ");
        }
        
        
    }
}
