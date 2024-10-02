import java.util.ArrayList;
import java.util.HashMap;

public class duplicateusinghashmap {
    
    public static ArrayList<Integer> duplicates(int[] arr) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> countMap = new HashMap<>();
        int n = arr.length;
        
        // Count the occurrences of each element
        for (int i = 0; i < n; i++) {
            countMap.put(arr[i], countMap.getOrDefault(arr[i], 0) + 1);
        }
        
        // Check which elements have a count greater than 1 (i.e., duplicates)
        for (int key : countMap.keySet()) {
            if (countMap.get(key) > 1) {
                ans.add(key);
            }
        }
        
        // If no duplicates were found, return -1
        if (ans.isEmpty()) {
            ans.add(-1);
        }
        
        return ans;
    
      
    
}
}
