import java.util.PriorityQueue;

public class KthLargest {
     public static void main(String[] args) {
        int arr[] = {7,3,4,10,15,20};
        int  k =3;
        findKthLargestUsingMinHeap(arr,k);
 // brute force approach
        // Arrays.sort(arr);
        //arr[n - k]
     }
         // Approach 2: Using a min heap
         public static int findKthLargestUsingMinHeap(int[] arr, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            minHeap.add(arr[i]);
        }
        for (int i = k; i < arr.length; i++) {
            if (arr[i] > minHeap.peek()) {
                minHeap.poll();
                minHeap.add(arr[i]);
            }
        }
        return minHeap.peek();
  

    }
}
