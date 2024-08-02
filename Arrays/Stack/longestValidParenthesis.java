package Stack;

import java.util.Stack;

public class longestValidParenthesis {
        public int longestValidParentheses(String S) {
        Stack<Integer> indexOfLastOpening = new Stack<>();
        indexOfLastOpening.push(-1);
        int ans = 0;
        for(int idx= 0; idx< S.length(); idx++){
            char ch = S.charAt(idx);
            if(ch == '('){
                indexOfLastOpening.push(idx);
            }else{
                indexOfLastOpening.pop();
                if(indexOfLastOpening.isEmpty()){
                    indexOfLastOpening.push(idx);
                }else{
                    ans = Math.max(ans,idx-indexOfLastOpening.peek());
                }
            }
        }
        return ans;
    }
}
