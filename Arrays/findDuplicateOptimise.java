import java.util.ArrayList;
import java.util.Arrays;

public class findDuplicateOptimise {
    public static void main(String[] args) {
        
    int arr[]= {2 , 3, 1, 2 ,3};
    int n = 5;
    Arrays.sort(arr);
        ArrayList<Integer> ans = new ArrayList<>();
        int left = 0;
        int right = 1;
    // 2 3 1 2 3
    // 1 2 2 3 3
        while (right < n) {
            if (arr[left] == arr[right]) {
                ans.add(arr[left]);
                while (right < n && arr[left] == arr[right]) {
                    right++;
                }
            } else {
                left = right;
                right++;
            }
        }
        
        if (ans.isEmpty()) {
            ans.add(-1);
        }
       System.out.println(ans);
    }
}
