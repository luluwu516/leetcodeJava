import java.util.Scanner;

public class ValidPalindrome2 {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        StringBuilder sb = new StringBuilder(); // under java.lang
        sb.append(s);
        sb.reverse();

        if (s.equals(sb.toString())) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        // declaration
        ValidPalindrome2 s = new ValidPalindrome2();
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
