import java.util.PriorityQueue;

public class KthSmallest {
    static int arr[] = {7, 10, 4, 3, 20, 15,2};
    static int k = 5; // Change the value of k to find the 3rd smallest element
   // arr[k-1]
    public static void findKthSmallestUsingMinHeap(int[] arr, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> b - a);

        for (int i = 0; i < k; i++) {
            minHeap.add(arr[i]);
        }
        for (int i = k; i < arr.length; i++) {
            if (arr[i] < minHeap.peek()) {
                minHeap.poll();
                minHeap.add(arr[i]);
            }
        
        }
    

       
    


        System.out.println("The " + k + "th smallest element is " + minHeap.peek());
    }

    public static void main(String[] args) {
        findKthSmallestUsingMinHeap(arr, k);
    }
}
