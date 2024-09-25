import java.util.Scanner;

public class FirstUniqueCharacter2 {
    public int firstUniqChar(String s) {
        int letters[] = new int[26];
        int len = s.length();
        for (int i = 0; i < len; i++) {
            letters[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < len; i++) {
            if (letters[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        // declaration
        FirstUniqueCharacter2 s = new FirstUniqueCharacter2();
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
