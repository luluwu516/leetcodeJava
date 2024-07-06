import java.util.Arrays;
import java.util.Scanner;

public class ValidAnagram2 {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] letters = new int[26];
        for (int i = 0; i < s.length(); i++) {
            letters[s.charAt(i) - 'a']++;
            letters[t.charAt(i) - 'a']--;
        }
        for (int count : letters) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // declaration
        ValidAnagram2 solution = new ValidAnagram2();
        Scanner in = new Scanner(System.in);
        String s, t;
        Boolean res;

        // input
        System.out.print("Enter a string: ");
        s = in.nextLine();
        System.out.print("Enter another string: ");
        t = in.nextLine();

        // processing
        res = solution.isAnagram(s, t);

        // output
        System.out.println("\nResult: ");
        System.out.printf("The strings are %s\n", (res ? "anagram" : "not anagram"));
    }
}
