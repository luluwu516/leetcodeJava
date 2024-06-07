import java.util.Arrays;
import java.util.Scanner;

public class IsomorphicStrings {
    public Boolean isIsomorphic(String s, String t) {
        int[] indexS = new int[128];
        Arrays.fill(indexS, -1);
        int[] indexT = new int[128];
        Arrays.fill(indexT, -1);

        int len = s.length();

        for (int i = 0; i < len; i++) {
            if (indexS[s.charAt(i)] != indexT[t.charAt(i)]) {
                return false;
            }
            indexS[s.charAt(i)] = i;
            indexT[t.charAt(i)] = i;
        }

        return true;
    }

    public static void main(String[] args) {
        // declaration
        IsomorphicStrings solution = new IsomorphicStrings();
        Scanner in = new Scanner(System.in);
        String s, t;
        Boolean res;

        // input
        System.out.print("Enter a string      : ");
        s = in.nextLine();
        System.out.print("Enter another string: ");
        t = in.nextLine();

        // processing
        res = solution.isIsomorphic(s, t);

        // output
        System.out.println("\nResult: ");
        System.out.printf("Two strings are %s\n", (res ? "isomorphic" : "not isomorphic"));
    }
}
