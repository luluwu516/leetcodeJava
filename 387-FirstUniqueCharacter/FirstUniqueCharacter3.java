import java.util.Scanner;

public class FirstUniqueCharacter3 {
    public int firstUniqChar(String s) {
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            for (int j = 0; j < len; j++) {
                if (i != j && c == s.charAt(j)) {
                    break;
                }
                if (j == len - 1) {
                    return i;
                }
            }
        }

        return -1;
    }

    public static void main(String args[]) {
        // declaration
        FirstUniqueCharacter3 s = new FirstUniqueCharacter3();
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
