import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }

        Stack<Character> st = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                st.push(s.charAt(i));
            } else {
                if (st.empty()) {
                    return false;
                } else if ((s.charAt(i) == ')' && st.peek() == '(')
                        || (s.charAt(i) == ']' && st.peek() == '[')
                        || (s.charAt(i) == '}' && st.peek() == '{')) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }

    public static void main(String args[]) {
        // declaration
        ValidParentheses v = new ValidParentheses();
        Scanner in = new Scanner(System.in);
        String strs;

        // input
        System.out.print("Enter parentheses, such as '(', ')', '{', '}', '[' or ']': ");
        strs = in.nextLine();

        // Processing and Output
        if (v.isValid(strs)) {
            System.out.println("\nThe parentheses is vaild.");
        } else {
            System.out.print("\nThe parentheses is invaild.");
        }
    }
}
