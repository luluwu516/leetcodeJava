import java.lang.String;
import java.util.Scanner;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else if (x < 10) {
            return true;
        }

        String str = String.valueOf(x);

        return testPalindrome(str, 0, str.length() - 1);
    }

    public boolean testPalindrome(String palindrome, int left, int right) {
        if (left >= right) {
            return true;
        }

        if (palindrome.charAt(left) == palindrome.charAt(right)) {
            return testPalindrome(palindrome, left + 1, right - 1);
        } else {
            return false;
        }
    }

    static public void main(String arg[]) {
        PalindromeNumber p = new PalindromeNumber();
        int num;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        num = in.nextInt();

        // processing and output
        System.out.print("\nResult: ");

        if (p.isPalindrome(num)) {
            System.out.printf("%d is a Palindrome Number.\n", num);
        } else {
            System.out.printf("%d is not a Palindrome Number.\n", num);
        }
    }
}
