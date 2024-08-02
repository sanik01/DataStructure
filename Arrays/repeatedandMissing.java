public class repeatedandMissing {
    int[] findTwoElement(int arr[], int n) {
        int[] ans = new int[2];
        long sum = 0;
        for(int val: arr){
            int posVal = Math.abs(val);
            if(arr[posVal-1] < 0){
                ans[0] = posVal;
            }else{
                arr[posVal-1] = -arr[posVal-1];
                sum += posVal;
            }
        }
        int missing = 0;
        if(n%2 ==0){
            missing = (int)((n/2.0)*(n+1) - sum);
        }else{
            missing = (int)((n)*((n+1)/2.0) - sum);
        }
        ans[1] = missing;
        return ans;
    }
    
}
// Time Complexity: O(N)
Space Complexity: O(1)
Explanation: This approach utilizes the fact that the array contains both positive and negative integers. By negating the values in the array based on their absolute values, it tracks the repeated element. The missing element is then calculated using a mathematical formula. This approach has O(1) space complexity, but it relies on arithmetic operations for finding the missing element.
