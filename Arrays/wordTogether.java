import java.util.ArrayList;
import java.util.HashMap;
public class wordTogether {
  


	public static void main(String args[]) {

        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        String words[] = { "may", "student", "students", "dog",
                 "studentssess", "god", "cat", "act", 
                 "tab", "bat", "flow", "wolf", "lambs", 
                 "amy", "yam", "balms", "looped", "poodle"};
                //  amy -> [may, yam, amy]
        for(int index = 0; index<words.length; index++){
            String word = words[index];
            String sortedForm = sortedSet(word);
            if(hm.containsKey(sortedForm)){
                ArrayList<String> sortedFormSyn = hm.get(sortedForm);
                sortedFormSyn.add(word);
                hm.put(sortedForm, sortedFormSyn);
            }else{
                ArrayList<String> sortedFormSyn = new ArrayList<>();
                sortedFormSyn.add(word);
                hm.put(sortedForm, sortedFormSyn);
            }
        }
        System.out.println(hm);
    }

    static String sortedSet(String str){
        boolean[] occurenceMap = new boolean[26];
        int lenOfString = str.length();
        StringBuilder sortedStr = new StringBuilder();
        for(int index = 0; index < lenOfString; index++){
            char currentChr = str.charAt(index);//'a'
            occurenceMap[currentChr - 'a'] = true;//currentChr
        }

        for(int index = 0; index < 26; index++){
            if(occurenceMap[index] == true){
                sortedStr.append((char)(index + 'a'));
            }
        }
        return sortedStr.toString();
    }
}

