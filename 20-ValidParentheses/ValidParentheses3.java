import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses3 {
    public boolean isValid(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }

        Stack<Character> st = new Stack<Character>();

        for (char c : s.toCharArray()) {
            if (c == '(')
                st.push(')');
            else if (c == '{')
                st.push('}');
            else if (c == '[')
                st.push(']');
            else if (st.isEmpty() || st.pop() != c)
                return false;
        }

        return st.isEmpty();
    }

    public static void main(String args[]) {
        // declaration
        ValidParentheses3 v = new ValidParentheses3();
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
