import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stackofBrackets = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') stackofBrackets.push(')');
            else if (c == '{') stackofBrackets.push('}');
            else if (c == '[') stackofBrackets.push(']');
            else {
                if (stackofBrackets.isEmpty() || stackofBrackets.pop() != c) {
                    return false;
                }
            }
        }

        return stackofBrackets.isEmpty(); // true if all brackets matched
    }
}
