package sorting;

public class mergeSorted {

    static long inversion;
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long inversionCount(long arr[], long N){
        // Your Code 
        inversion = 0;
        sort(arr, 0 , arr.length-1);
        return inversion;
    }
    // mergeSort
    static void sort(long[] arr, int start, int end){
        if(start < end){
            int mid = start + (end-start)/2;
            sort(arr, start, mid);
            sort(arr, mid+1 , end);
            merge(arr, start, end);
        }
    }
    
    static void merge(long[] arr, int start, int end){
        int mid = start +(end-start)/2;
        int leftArraySize = mid-start+1;
        long[] left = new long[leftArraySize];
        for(int idx = 0; idx<leftArraySize; idx++ ){
            left[idx] = arr[start+idx];
        }
        int rightArraySize = end-mid;
        long[] right = new long[rightArraySize];
        for(int idx = 0; idx<rightArraySize; idx++ ){
            right[idx] = arr[mid+1+idx];
        }
        int l = 0;
        int r= 0;
        int s = start;
        while(l<leftArraySize && r<rightArraySize){
            if(left[l] <= right[r]){
                arr[s] = left[l];
                l++;
            }else{
                inversion += leftArraySize - l;
                arr[s] = right[r];
                r++;
            }
            s++;
        }
        while(l<leftArraySize){
            arr[s++] = left[l++];
        }
        while(r<rightArraySize){
            arr[s++] = right[r++];
        }
    }
    
}
