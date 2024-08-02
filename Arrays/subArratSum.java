import java.util.ArrayList;

public class subArratSum {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int row= 0 ; row< n; row++){
            for(int col=row; col< n; col++){
                int sum = 0;
                for(int currentSubarray = row; currentSubarray<=col; currentSubarray++){
                    sum += arr[currentSubarray];
                }
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
