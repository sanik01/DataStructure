import java.util.ArrayList;
import java.util.HashMap;

public class countDistnict {
    ArrayList<Integer> countDistinct(int A[], int n, int k)
    {
        // code here 
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int idx=0;idx<k;idx++){
            hm.put(A[idx],hm.getOrDefault(A[idx],0)+1);
        }
        ans.add(hm.size());
        
        for(int i =k;i<n;i++)
        {

            if(hm.get(A[i-k])==1){
                hm.remove(A[i-k]);
            }


        else{
         hm.put(A[i-k],hm.get(A[i-k])-1);
        }
         hm.put(A[i],hm.getOrDefault(A[i],0)+1);
         
         ans.add(hm.size());
        
        }

        
        return ans;
    }
}
