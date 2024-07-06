import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class ValidAnagram3 {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        int len = s.length();

        for (int i = 0; i < len; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) - 1);
        }
        for (char key : map.keySet()) {
            if (map.get(key) != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // declaration
        ValidAnagram3 solution = new ValidAnagram3();
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
