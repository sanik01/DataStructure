import java.util.ArrayList;

public class subArraySum {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int row= 0 ; row< n; row++){
            int sum = 0;
            for(int col=row; col< n; col++){
                sum += arr[col];
                if(sum == s){
                    ans.add(row + 1);
                    ans.add(col + 1);
                    return ans;
                }
            }
        }
        ans.add(-1);
        return ans;
    }
}
