package String;

import java.util.HashMap;

public class subarraycountofzeroandone {
    

//User function Template for Java


    //Function to count subarrays with 1s and 0s.
    static int countSubarrWithEqualZeroAndOne(int arr[], int n)
    {
        // add your code here
    int countOf0 = 0;
        int countOf1 = 0;
        int ans = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0,1);
        for(int val: arr){
            if(val == 1){
                countOf1++;
            }else{
                countOf0++;
            }
            int key = (countOf0 - countOf1);
            if(hm.containsKey(key)){
                int freqTillNow = hm.get(key);
                ans += freqTillNow;
                hm.put(key, freqTillNow +1);
            }else{
                hm.put(key, 1);
            }
        }
        return ans;
    }
        
    
}


