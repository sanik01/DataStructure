import java.util.HashMap;

public class firstelementKtime {
     public int firstElementKTime(int[] a, int n, int k) { 
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for(int idx = 0; idx < n; idx++){
            int key = a[idx];
            if(frequencyMap.containsKey(key)){
                frequencyMap.put(key, frequencyMap.get(key) +1);
            }else{
                frequencyMap.put(key, 1);
            }
            if(frequencyMap.get(key) == k){
                return key;
            }
        }
        return -1;
        
    } 
}
