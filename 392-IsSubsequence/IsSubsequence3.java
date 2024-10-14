import java.util.Scanner;

public class IsSubsequence3 {
    boolean isSubsequence(String s, String t) {
        for (int j = 0; j < s.length(); j++) {
            int i = t.indexOf(s.charAt(j));
            if (i < 0) {
                return false;
            }
            t = t.substring(i + 1);
        }
        return true;
    }

    public static void main(String args[]) {
        // declaration
        IsSubsequence3 s = new IsSubsequence3();
        Scanner in = new Scanner(System.in);
        String str1, str2;
        boolean res;

        // input
        System.out.print("\nEnter s: ");
        str1 = in.nextLine();
        System.out.print("Enter t: ");
        str2 = in.nextLine();

        // processing
        res = s.isSubsequence(str1, str2);

        // output
        System.out.println("\nResult: ");
        System.out.printf(
                "'s' is%s a new string that is formed from 't' by deleting some (can be none) of the characters\n\n",
                res ? "" : " not");
    }
}
