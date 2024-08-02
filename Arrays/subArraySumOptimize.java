import java.util.ArrayList;

public class subArraySumOptimize {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer> ans = new ArrayList<>();
        //sliding window
        int start = 0;
        int end = 0;
        int sum =0;
        while( end < n){
            sum += arr[end];
            while(sum > s && start < end){
                sum -= arr[start];
                start++;
            }
            if(sum== s){
                ans.add(start+1);
                ans.add(end+1);
                return ans;
            }
            end++;
        }
        ans.add(-1);
        return ans;
    }
}
