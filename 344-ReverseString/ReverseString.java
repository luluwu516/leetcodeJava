import java.util.Scanner;

public class ReverseString {
    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String args[]) {
        // declaration
        ReverseString s = new ReverseString();
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
