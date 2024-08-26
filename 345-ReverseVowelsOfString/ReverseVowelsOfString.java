import java.util.Scanner;

public class ReverseVowelsOfString {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        int left = 0, right = s.length() - 1;
        while (left < right) {
            char l = Character.toLowerCase(sb.charAt(left));
            if (l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u') {
                char r = Character.toLowerCase(sb.charAt(right));
                while (!(r == 'a' || r == 'e' || r == 'i' || r == 'o' || r == 'u')) {
                    right--;
                    r = Character.toLowerCase(sb.charAt(right));
                }
                char temp = sb.charAt(left);
                sb.setCharAt(left, sb.charAt(right));
                sb.setCharAt(right, temp);
                right--;
            }
            left++;
        }
        return sb.toString();
    }

    public static void main(String args[]) {
        // declaration
        ReverseVowelsOfString s = new ReverseVowelsOfString();
        Scanner in = new Scanner(System.in);
        String string, res;

        // input
        System.out.print("\nEnter a string: ");
        string = in.nextLine();

        // processing
        res = s.reverseVowels(string);

        // output
        System.out.println("\nResult: ");
        System.out.printf("Reverse only all the vowels in the string: %s\n\n", res);
    }
}
