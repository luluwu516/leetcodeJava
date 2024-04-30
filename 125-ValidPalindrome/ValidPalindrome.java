import java.util.Scanner;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            // Or `!isAlphanumeric(s.charAt(left))`
            while (!Character.isLetterOrDigit(s.charAt(left)) && left < right) {
                left++;
            }
            while (!Character.isLetterOrDigit(s.charAt(right)) && left < right) {
                right--;
            }

            // Or `lowerCase(s.charAt(left))`
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        // declaration
        ValidPalindrome s = new ValidPalindrome();
        Scanner in = new Scanner(System.in);
        String input;
        Boolean res;

        // input
        System.out.print("Enter a string: ");
        input = in.nextLine();

        // processing
        res = s.isPalindrome(input);

        // output
        System.out.println("\nResult: ");
        System.out.printf("The string is %s\n", (res ? "a palindrome" : "not a palindrome"));
    }
}
