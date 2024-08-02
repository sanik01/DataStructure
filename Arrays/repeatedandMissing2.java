public class repeatedandMissing2 {
    int[] findTwoElement(int arr[], int n) {
        int[] ans = new int[2];
        boolean[] map = new boolean[n+1];
        for(int val: arr){
            if(map[val] == true){//repeated O(1) amortized
                ans[0] = val;
            }else{
                map[val] = true;
            }
        }
        for(int val = 1; val<=n; val++){
            if(map[val] == false){
                ans[1] = val;
                return ans;
            }
        }
        return ans;
    }
    
}
// Time Complexity: O(N)
// Space Complexity: O(N)
// Explanation: Instead of using a HashSet, this approach employs a boolean array to mark the presence of elements. The time and space complexity remain the same as the first approach, but this approach may have slightly better performance due to constant-time array access.