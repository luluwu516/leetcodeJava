import java.util.Arrays;
import java.util.Scanner;

public class FindTheDifference3 {
    public char findTheDifference(String s, String t) {
        int len = s.length();
        char sArray[] = s.toCharArray();
        char tArray[] = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        for (int i = 0; i < len; i++) {
            if (sArray[i] != tArray[i]) {
                return tArray[i];
            }
        }
        return tArray[len];
    }

    public static void main(String args[]) {
        // declaration
        FindTheDifference3 s = new FindTheDifference3();
        Scanner in = new Scanner(System.in);
        String str1, str2;
        char res;

        // input
        System.out.print("\nEnter s: ");
        str1 = in.nextLine();
        System.out.print("Enter t: ");
        str2 = in.nextLine();

        // processing
        res = s.findTheDifference(str1, str2);

        // output
        System.out.println("\nResult: ");
        System.out.printf("'%c' is the letter that was added\n\n", res);
    }
}
