package String;
import java.util.HashMap;
public class Anagram {
    public static boolean isAnagram(String a,String b)
    {
        int lenA = a.length();
        int lenB = b.length();
        
        if( lenA != lenB){
            return false;
        }
        // Your code here
        HashMap<Character, Integer> freqMapA = new HashMap<>();
        HashMap<Character, Integer> freqMapB = new HashMap<>();
        for(int idx = 0; idx < lenB; idx++){
            char charA = a.charAt(idx);
            char charB = b.charAt(idx);
            addChar(charA, freqMapA);
            addChar(charB, freqMapB);
        }
        for(int idx = 0; idx < 26; idx++){
            char currentChar = (char)(idx+'a');
            boolean containsInFirst = freqMapA.containsKey(currentChar);
            boolean containsInSecond = freqMapB.containsKey(currentChar);
            if( containsInFirst && !containsInSecond ){
                return false;
            }
            if(!containsInFirst && containsInSecond ){
                return false;
            }
            
            if(!containsInFirst && !containsInSecond){
                continue;
            }
            
            if(!freqMapA.get(currentChar).equals(freqMapB.get(currentChar)) ){
                return false;
            }
        }
        return true;
        
    }
    static void addChar( char ch, HashMap<Character, Integer> freqMap){
        if(freqMap.containsKey(ch)){
            freqMap.put(ch, freqMap.get(ch) + 1);
        }else{
            freqMap.put(ch, 1);    
        }
    }
}
