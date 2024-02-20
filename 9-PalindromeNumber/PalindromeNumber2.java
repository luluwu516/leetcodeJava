import java.lang.String;
import java.util.Scanner;

public class PalindromeNumber2 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else if (x < 10) {
            return true;
        }

        String str = String.valueOf(x);
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
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
