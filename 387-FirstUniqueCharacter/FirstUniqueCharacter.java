import java.util.Scanner;
import java.util.HashMap;

public class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> m = new HashMap<Character, Integer>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (m.containsKey(c)) {
                m.put(c, m.get(c) + 1);
            } else {
                m.put(c, 1);
            }
        }

        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (m.get(c) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        // declaration
        FirstUniqueCharacter s = new FirstUniqueCharacter();
        Scanner in = new Scanner(System.in);
        String str;
        int res;

        // input
        System.out.print("\nEnter a string: ");
        str = in.nextLine();

        // processing
        res = s.firstUniqChar(str);

        // output
        System.out.println("\nResult: ");
        if (res != -1) {
            System.out.printf(
                    "The character %c at index %d is the first character that does not occur at any other index.\n\n",
                    str.charAt(res), res);
        } else {
            System.out.printf("The non-repeating character does not exist.\n\n");
        }
    }
}
