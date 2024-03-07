import java.util.Scanner;

public class LengthOfLastWord2 {
    public int lengthOfLastWord(String s) {
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                int j = i;
                while (j >= 0 && s.charAt(j) != ' ') {
                    count++;
                    j--;
                }
                return count;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        // declaration
        LengthOfLastWord2 l = new LengthOfLastWord2();
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
