import java.util.Scanner;

public class ValidParentheses2 {
    public boolean isValid(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }

        int top = -1;

        char[] st = new char[s.length()];
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                top++;
                st[top] = c;
            } else {
                if (top >= 0 && ((st[top] == '(' && c == ')') ||
                        (st[top] == '{' && c == '}') ||
                        (st[top] == '[' && c == ']'))) {
                    top--;
                } else {
                    return false;
                }
            }
        }
        return top == -1;
    }

    public static void main(String args[]) {
        // declaration
        ValidParentheses2 v = new ValidParentheses2();
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
