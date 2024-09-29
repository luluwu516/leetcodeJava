import java.util.Scanner;

public class FindTheDifference2 {
    public char findTheDifference(String s, String t) {
        int len = s.length();
        int lettersCounter[] = new int[26];
        for (int i = 0; i < len; i++) {
            lettersCounter[s.charAt(i) - 97]++;
            lettersCounter[t.charAt(i) - 97]--;
        }
        lettersCounter[t.charAt(len) - 97]--;
        for (int i = 0; i < 26; i++) {
            if (lettersCounter[i] != 0) {
                return (char) (i + 97);
            }
        }
        return t.charAt(len);
    }

    public static void main(String args[]) {
        // declaration
        FindTheDifference2 s = new FindTheDifference2();
        Scanner in = new Scanner(System.in);
        String str1, str2;
        char res;

        // input
        System.out.print("\nEnter s: ");
        str1 = in.nextLine();
        System.out.print("Enter t: ");
        str2 = in.nextLine();

        // processing
        res = s.findTheDifference(str1, str2);

        // output
        System.out.println("\nResult: ");
        System.out.printf("'%c' is the letter that was added\n\n", res);
    }
}
