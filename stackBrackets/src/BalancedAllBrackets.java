import java.util.Stack;

public class BalancedAllBrackets
{
    public String checkBalance(String string) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return "unbalanced";

                char prevChar = stack.peek();
                if (
                    (prevChar == '(' && c == ')') ||
                    (prevChar == '[' && c == ']') ||
                    (prevChar == '{' && c == '}')
                ) stack.pop();
                else return "unbalanced";
            }
        }

        if (stack.isEmpty()) return "balanced";
        else return "unbalanced";
    }
}
