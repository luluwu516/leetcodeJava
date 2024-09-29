import java.util.Scanner;

public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        int sumS = 0, sumT = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            sumS += s.charAt(i);
            sumT += t.charAt(i);
        }
        sumT += t.charAt(len);

        return (char) (sumT - sumS);
    }

    public static void main(String args[]) {
        // declaration
        FindTheDifference s = new FindTheDifference();
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
