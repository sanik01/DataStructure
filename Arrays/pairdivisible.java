import java.util.HashMap;
import java.util.Map;

public class pairdivisible {
     public boolean canArrange(int[] nums, int target) {
        HashMap<Integer, Integer> modFreq = new HashMap<>();
        for(int val: nums){
            int mod = val%target < 0 ? val%target + target : val%target;
            if(modFreq.containsKey(mod)){
                int oldFreq = modFreq.get(mod);
                modFreq.put(mod, oldFreq + 1);//1->1; 1->2
            }else{
                modFreq.put(mod, 1);// 1->1
            }
            // modFreq.put(val % target, modFreq.getOrDefault(val % target,0)+1));
        }
        
        for(Map.Entry<Integer, Integer> e: modFreq.entrySet()){
            int k = e.getKey();//mod
            int v = e.getValue();
            if(k == 0){
                if(v % 2 == 1){
                    return false;
                }
            }else if( k*2 == target){
                if(v % 2 == 1){
                    return false;
                }
            }else{
                int otherMod = target - k;
                if(!modFreq.containsKey(otherMod)){
                    return false;
                }
                if(modFreq.get(otherMod) != v){
                    return false;
                }
            }
        }
        return true;
    }
}
