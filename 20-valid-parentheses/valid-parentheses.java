import java.util.Stack;

class Solution {
    public boolean check_parantheses(char x, char y) {
        return ((x == '(' && y == ')') || (x == '{' && y == '}') || (x == '[' && y == ']'));
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int l = s.length();

        for (int i = 0; i < l; i++) {
            char x = s.charAt(i);

            if (x == '(' || x == '{' || x == '[') {
                stack.push(x);
            } else {
                if (stack.isEmpty()) return false;

                if (!check_parantheses(stack.peek(), x)) return false;

                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
