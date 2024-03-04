import java.util.Scanner;

public class FindIndexInString {
    public int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) {
            return -1;
        }

        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            boolean flag = false;
            if (haystack.charAt(i) == needle.charAt(0)) {
                flag = true;
                for (int j = 0; j < needle.length(); j++) {
                    if (haystack.charAt(i + j) != needle.charAt(j)) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    return i;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        // declaration
        FindIndexInString f = new FindIndexInString();
        Scanner in = new Scanner(System.in);
        String haystack, needle;
        int index;

        // input
        System.out.print("\nEnter the first string: ");
        haystack = in.next();

        System.out.print("Enter the second string: ");
        needle = in.next();

        // processing
        index = f.strStr(haystack, needle);

        // output
        System.out.println("\nResult");
        if (index != -1) {
            System.out.printf("The first \"%s\" occurs at index %d\n\n", needle, index);
        } else {
            System.out.printf("\"%s\" did not occur in \"%s\"\n\n", needle, haystack);
        }
    }
}
