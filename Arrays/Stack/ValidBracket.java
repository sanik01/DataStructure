import java.util.Stack;

public class ValidBracket {
    public static void main(String[] args) {
        // Example usage
        String input = "{[()]}";
        boolean result = isValid(input);
        System.out.println("Is the bracket sequence valid? " + result);
    }

    public static boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        for (int idx = 0; idx < s.length(); idx++) {
            char ch = s.charAt(idx);
            if (ch == '{' || ch == '[' || ch == '(') {
                stk.push(ch);
            } else if (ch == '}' || ch == ']' || ch == ')') {
                if (stk.isEmpty()) {
                    return false;
                }
                if (ch == '}' && stk.peek() != '{') {
                    return false;
                }
                if (ch == ')' && stk.peek() != '(') {
                    return false;
                }
                if (ch == ']' && stk.peek() != '[') {
                    return false;
                }
                stk.pop();
            }
        }
        return stk.isEmpty();
    }
}
