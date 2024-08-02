import java.util.HashSet;

public class repeatedandMissing1 {
    int[] findTwoElement(int arr[], int n) {
    int[] ans = new int[2];
    HashSet<Integer> hs = new HashSet<>();
    for(int val: arr){
        if(hs.contains(val)){//repeated
            ans[0] = val;
        }else{
            hs.add(val);
        }
    }
    for(int val = 1; val<=n; val++){
        if(!hs.contains(val)){
            ans[1] = val;
            return ans;
        }
    }
    return ans;
}

}
// Time Complexity: O(N)
Space Complexity: O(N)
Explanation: The code uses a HashSet to identify the repeated element, and then it iterates through the array to find the missing element. The HashSet helps in constant-time lookups and insertions, but the overall time complexity is still O(N) due to the two sequential loops.