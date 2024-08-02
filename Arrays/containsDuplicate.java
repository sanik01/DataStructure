import java.util.HashSet;
import java.util.Set;

public class containsDuplicate {
    int nums[]={1,2,3,4,3};
    public boolean contains(int nums[]){
        Set<Integer> entry = new HashSet<>();
        for(int idx =0;idx<nums.length;idx++){
            if(entry.contains(nums[idx])){
                return true;
            }
                
        
        entry.add(nums[idx]);
    }
    return false;
}
}
