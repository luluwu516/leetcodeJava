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
        // Declaration
        PalindromeNumber2 p = new PalindromeNumber2();
        int num;
        Scanner in = new Scanner(System.in);

        // Input
        System.out.print("Enter an integer: ");
        num = in.nextInt();

        // Processing and Output
        System.out.print("\nResult: ");

        if (p.isPalindrome(num)) {
            System.out.printf("%d is a Palindrome Number.\n", num);
        } else {
            System.out.printf("%d is not a Palindrome Number.\n", num);
        }
    }
}
