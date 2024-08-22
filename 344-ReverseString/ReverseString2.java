import java.util.Scanner;

public class ReverseString2 {
    public void reverseString(char[] s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s) {
            sb.append(c);
        }
        sb.reverse();
        for (int i = 0; i < s.length; i++) {
            s[i] = sb.charAt(i);
        }
    }

    public static void main(String args[]) {
        // declaration
        ReverseString2 s = new ReverseString2();
        Scanner in = new Scanner(System.in);
        String string;

        // input
        System.out.print("\nEnter a string: ");
        string = in.nextLine();
        char[] letters = string.toCharArray();

        // processing
        s.reverseString(letters);

        // output
        System.out.println("\nResult: ");
        for (char c : letters) {
            System.out.printf("%c ", c);
        }
        System.out.println("");
    }
}
