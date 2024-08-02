package String;

import java.util.HashMap;
import java.util.HashSet;

public class IsomorphicString {
    public static boolean areIsomorphic(String str1,String str2){
        // Your code here
        HashMap<Character, Character> str1ToStr2 = new HashMap<>();
        HashSet<Character> str2ToStr1 = new HashSet<>();
        int len1 = str1.length();
        int len2 = str2.length();
        if(len1 != len2){
            return false;
        }
        
         for(int idx = 0; idx < len1; idx++){
             char ch1 = str1.charAt(idx);
             char ch2 = str2.charAt(idx);
             //ch1->ch2
             if(str2ToStr1.contains(ch2)){//!ch2
                 if(!str1ToStr2.containsKey(ch1)){// ch1 is not mapped
                     return false;
                 }
                 if(str1ToStr2.get(ch1) != ch2){// ch2 is mapped but not with ch1 and ch1 also mapped
                     return false;
                 }
             }else{
                 if(str1ToStr2.containsKey(ch1)){//ch1 mapped with someone else
                     return false;
                 }
                 str1ToStr2.put(ch1,ch2);
                 str2ToStr1.add(ch2);
             }
             
         }
         return true;
        
    }

}
