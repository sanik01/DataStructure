import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class threeSum {
    public static void main(String[] args) {
        
    }
    public List<List<Integer>> threeSum(int[] nums) {
        

         List<List<Integer>> result = new ArrayList<>();
         
         int n = nums.length;
         Arrays.sort(nums);
         if(n<3){
             return result;
         }
         for(int i =0;i<nums.length-2;i++){
             if(i>0 && nums[i]==nums[i-1]) continue;
             int target= -(nums[i]);
             int left = i+1;
             int right= n-1;
             while(left<right){
              if(nums[left]+nums[right]<target){
                 left++;
             }else if(nums[left]+nums[right]>target){
                 right--;

             }else{
              result.add(Arrays.asList(nums[i],nums[left],nums[right]));
              while(left<right && nums[left]==nums[left+1])left++;
              while(left<right && nums[right]==nums[right-1])right--;
              left++;
              right--;
             }
             }
             
         }
        
        return result;
    }
}