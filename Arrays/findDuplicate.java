import java.util.ArrayList;
import java.util.Arrays;

public class findDuplicate {
    public static void main(String[]args){
        int arr[]={2,3,1,2,3};
        int n = 5;
  
    
     
        Arrays.sort(arr);
        ArrayList<Integer> ans = new ArrayList<>();
        for(int idx =0;idx<arr.length;idx++){
            if(idx!=arr.length-1 && arr[idx]==arr[idx+1]){
                ans.add(arr[idx]);
                idx++;
            }
        }
        if(ans.isEmpty()){
            ans.add(-1);
        }
            System.out.println(ans);
            
        
    }

     

}