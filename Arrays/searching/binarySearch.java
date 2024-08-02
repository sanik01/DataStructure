package searching;

public class binarySearch {
    public static void main(String args[]) {
        // Binary Search
        int[] ary = {1, 5, 7, 24, 47, 51};
        // Binary search "ONLY" applicable when given array is sorted.
        int start = 0;
        int end = ary.length - 1;
        int key =7;
        boolean found  = false;
        while(start <= end){
            int mid = (start + end) / 2;
            // int mid = start + (end-start)/2;
            if(ary[mid] == key){
                System.out.println(mid);
                found = true;
                break;
            }
            if(ary[mid] < key){
                start = mid +1;
            }else{
                end = mid - 1;
            }
        }
        if(found == false){
            System.out.println("Na mil paya");
        }

    }
}
