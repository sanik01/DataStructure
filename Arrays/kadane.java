public class kadane {
    public static void main(String[] args) {
        int arr[] = {-2, 1, -3, 8, -1, 3};
        int n = arr.length; // Update n to the length of the array
        longSubArray(arr, n);
    }
    
    public static void longSubArray(int arr[], int n) {
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;
       
        for (int idx = 0; idx < n; idx++) {
            curSum += arr[idx];
            if (curSum > maxSum) {
                maxSum = curSum;
            }
            if (curSum < 0) {
                curSum = 0;
            }
        }
        if (maxSum == Integer.MIN_VALUE) {
            System.out.println("-1");
        } else {
            System.out.println("Maximum contiguous sum is " + maxSum);
        }
    }
}
