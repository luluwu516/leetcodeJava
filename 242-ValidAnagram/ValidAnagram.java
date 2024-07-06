import java.util.Arrays;
import java.util.Scanner;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] letters_s = s.toCharArray();
        char[] letters_t = t.toCharArray();

        Arrays.sort(letters_s);
        Arrays.sort(letters_t);

        // return Arrays.equals(letters_s, letters_t);
        s = new String(chars);
        t = new String(chars1);
        return (s.equalsIgnoreCase(t));
    }

    public static void main(String[] args) {
        // declaration
        ValidAnagram solution = new ValidAnagram();
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
