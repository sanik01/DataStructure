import java.util.HashMap;
import java.util.HashSet;

public class countSubarrayDistnict {
    // Method to calculate distinct sub-array 
    static int countDistinctSubarray(int arr[], int n) { 
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        HashSet<Integer> distinct = new HashSet<>();
        for(int val: arr){
            distinct.add(val);
        }
        int distinctElements = distinct.size();
        int start = -1;//(start,end]
        int end = -1;//ending point of array
        int ans = 0;
        while( end != n -1 ){
            
            while( end < n-1 ){
                end++;
                int currVal = arr[end];
                freqMap.put(currVal, freqMap.getOrDefault(currVal, 0) + 1);

                if(freqMap.size() == distinctElements){
                    ans += n-end;
                    break;
                }
            }
            //decrease size of therh window
            while(start< end){
                // 
                start++;
                int startingValue = arr[start];
                int currCount = freqMap.get(startingValue);
                if( currCount == 1){
                    freqMap.remove(startingValue);
                }else{
                    freqMap.put(startingValue, currCount - 1);
                }
                if(freqMap.size() == distinctElements){
                    ans += n-end;
                }else{
                    break;
                }
            }
        }
        return ans;
    }
}
