import java.util.Scanner;

public class LengthOfLastWord3 {
    public int lengthOfLastWord(String s) {
        int lastWordEnd, lastWordStart;
        int i = s.length() - 1;

        lastWordEnd = i;
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        lastWordEnd = i;

        while (i >= 0 && s.charAt(i) != ' ') {
            i--;
        }
        lastWordStart = i;

        return lastWordEnd - lastWordStart;
    }

    public static void main(String[] args) {
        // declaration
        LengthOfLastWord3 l = new LengthOfLastWord3();
        Scanner in = new Scanner(System.in);
        String s;
        int result;

        // input
        System.out.print("\nEnter a string: ");
        s = in.next();

        // processing
        result = l.lengthOfLastWord(s);

        // output
        System.out.println("\n\nResult:");
        System.out.printf("The length of the last word is %d\n\n", result);
    }
}
