import java.util.Scanner;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        return words[words.length - 1].length();
    }

    public static void main(String[] args) {
        // declaration
        LengthOfLastWord l = new LengthOfLastWord();
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
