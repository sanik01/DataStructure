public class palindromeString {  
      public static void main(String[] args){
        String S = "aba";
        System.out.println(isPalindrome(S));
      }
    


public static boolean isPalindrome(String S) {
    int left = 0;
    int right = S.length() - 1;
    while (left < right) {
        if (S.charAt(left) != S.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }
    return true;
}
}