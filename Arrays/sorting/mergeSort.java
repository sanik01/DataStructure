package sorting;

public class mergeSort {
    
        // merge sort
        public static void main(String args[]) {
            int[] ary = {1,10,8,6,9,-1,0,9,2,7,4,6,5, -1};
            mergeSort(ary, 0, ary.length-1);
            for(int val: ary){
                System.out.print(val+" ");
            }
        }
    
        static void mergeSort(int[] ary, int start, int end){
            //start ------ mid-------end
            if(start < end){
                int mid = start + (end-start)/2;
                mergeSort(ary, start, mid);
                mergeSort(ary, mid+1, end);
                mergeSortedArray(ary, start, end);
            }
        }
    
        static void copy(int[] dest, int[] src, int start, int end, int k ){
            while( start <= end){
                dest[k++] = src[start++];
            }
        }
    
    
        static void mergeSortedArray(int[] ary,int start,int end){
            int mid = start + (end-start)/2;
            int size1 = mid - start + 1;
            int size2 = end - mid;
            int[] a1 = new int[size1];
            int[] a2 = new int[size2];
            
            copy(a1, ary, start, mid, 0);//copy left array into a1
            copy(a2, ary, mid+1, end, 0);//copy right array into a1
            
            int p1 = 0;
            int p2 = 0;
            int k = start;
            while(p1 < size1 && p2 < size2){
                if(a1[p1] <= a2[p2]){
                    ary[k++] = a1[p1++];
                }else{
                    ary[k++] = a2[p2++];
                }
            }
            // copy to ary if first array's elements are remaining
            copy(ary, a1, p1, size1 - 1, k);
            // copy to ary if second array's elements are remaining
            copy(ary, a2, p2, size2 - 1, k);
        }
    }

