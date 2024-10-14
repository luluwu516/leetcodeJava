import java.util.Scanner;

public class IsSubsequence {
    boolean isSubsequence(String s, String t) {
        int lenS = s.length();
        int lenT = t.length();
        int index = 0, i = 0;

        while (index < lenS && i < lenT) {
            if (s.charAt(index) == t.charAt(i)) {
                index++;
            }
            i++;
        }
        return index == lenS;
    }

    public static void main(String args[]) {
        // declaration
        IsSubsequence s = new IsSubsequence();
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
