public class reverseEachWordandTitleCase {
    // reverse each word and convert into title-case
public static void main(String args[]) {
        String str = "welcome to the world";
        String[] words = str.split(" ");
        StringBuilder println = new StringBuilder();
        for(String word : words){
            println.append(reverse(word)+" ");
        }
        System.out.println(println.toString());
        // printing is very costly operation
        // title case
    }
    static String reverse(String str){
        //welcome
        StringBuilder rev = new StringBuilder(str);
        int len = str.length();
        for(int idx = 0; idx<len/2; idx++){
            char first = str.charAt(idx);
            char second = str.charAt(len-idx-1);
            if(idx == 0){
                second = Character.toUpperCase(second);
            }
            rev.setCharAt(len-idx-1,first);
            rev.setCharAt(idx, second );
        }
        return rev.toString();
    }
}
