import java.util.Scanner;

public class PalindromeNumber3 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else if (x < 10) {
            return true;
        }

        int temp = x;
        int reversed = 0;
        int dig;

        while (temp != 0) {
            dig = temp % 10;
            reversed = reversed * 10 + dig;
            temp /= 10;
        }

        return x == reversed;
    }

    static public void main(String arg[]) {
        // Declaration
        PalindromeNumber3 p = new PalindromeNumber3();
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
