package String;

import java.util.HashMap;

public class substringlengthzeroandone {
    public static void main(String[] args) {
        String str = "11011001";
        // "0,1,0,-1,0,-1,0,1"
        // longest length = 0,1
        int countOf0 = 0;
        int countOf1 = 0;
        int ans = 0;
        HashMap<String, Integer> hm = new HashMap<>();
        for(int idx = 0; idx <str.length(); idx++){
            String chr = str.charAt(idx) + "";
            if(chr.equals("1")){
                countOf1++;
            }else{
                countOf0++;
            }
            String key = (countOf0 - countOf1) +"";
            if(hm.containsKey(key)){
                int firstOccurence = hm.get(key);
                int len = idx - firstOccurence;
                ans = Math.max(ans, len);
            }else{
                hm.put(key, idx);
            }
        }
        System.out.println(ans);
    }
  
}
