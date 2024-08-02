package String;

import java.util.ArrayList;

public class shortestDistance {
    int shortestDistance(ArrayList<String> s, String word1, String word2) {
        // code here
        int idxWord1 = -1;
        int idxWord2 = -1;
        int ans = s.size();
        for(int idx = 0; idx < s.size(); idx++) {
            String word = s.get(idx);
            if(word.equals(word1)){
                idxWord1=idx;
            }
            if(word.equals(word2)){
                idxWord2 = idx;
            }
            if(idxWord2 != -1 && idxWord1 != -1){
                ans = Math.min(ans, Math.abs(idxWord1- idxWord2));
            }
        }
        return ans;
    }
}
