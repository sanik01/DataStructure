import java.util.Arrays;

public class findPairOptimise {
    public boolean findPair(int arr[], int size, int n) {
         Arrays.sort(arr);  // sort the input array in ascending order
    int left = 0, right = 1;  // initialize two pointers

    // loop through the array until either pointer goes out of bounds
    while (left < size && right < size) {
        int diff = arr[right] - arr[left];
        if (diff == n) {  // if a pair with the required difference is found
            return true;
        } else if (diff < n) {  // if the difference is less than required, move the right pointer
            right++;
        } else {  // if the difference is greater than required, move the left pointer
            left++;
        }
        if (left == right) {  // if both pointers point to the same element, move the right pointer
            right++;
        }
    }
    return false;  // if no pair with the required difference is found
   }

}
