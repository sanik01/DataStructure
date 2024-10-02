public class validPalindrome {
   
        public boolean isPalindrome(String s) {
            int st = 0;
            int lst = s.length() - 1;
    
            while (st <= lst) {
                if (!Character.isLetterOrDigit(s.charAt(st))) {
                    st++;
                } else if (!Character.isLetterOrDigit(s.charAt(lst))) {
                    lst--; // Corrected typo from ls++ to lst--
                } else {
                    if (Character.toLowerCase(s.charAt(st)) != Character.toLowerCase(s.charAt(lst))) {
                        return false;
                    }
                    st++;
                    lst--;
                }
            }
            return true;
        }
    
    
}
