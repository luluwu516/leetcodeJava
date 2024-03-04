import java.util.Scanner;

public class FindIndexInString2 {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        // declaration
        FindIndexInString2 f = new FindIndexInString2();
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
