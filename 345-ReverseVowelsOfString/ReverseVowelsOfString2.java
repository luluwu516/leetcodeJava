import java.util.Scanner;

public class ReverseVowelsOfString2 {
    public Boolean isVowel(char c) {
        switch (Character.toLowerCase(c)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
    }

    public String reverseVowels(String s) {
        char[] charArray = s.toCharArray();

        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (isVowel(charArray[left])) {
                while (!isVowel(charArray[right])) {
                    right--;
                }
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;
                right--;
            }
            left++;
        }
        return String.valueOf(charArray);
    }

    public static void main(String args[]) {
        // declaration
        ReverseVowelsOfString2 s = new ReverseVowelsOfString2();
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
