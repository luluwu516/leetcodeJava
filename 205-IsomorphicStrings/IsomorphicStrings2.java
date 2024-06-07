import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IsomorphicStrings2 {
    public Boolean isIsomorphic(String s, String t) {
        Map<Character, Character> mapS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char cS = s.charAt(i);
            char cT = t.charAt(i);

            if (mapS.containsKey(cS)) {
                if (mapS.get(cS) != cT) {
                    return false;
                }
            } else {
                if (mapS.containsValue(cT)) {
                    return false;
                }
                mapS.put(cS, cT);
            }

        }

        return true;
    }

    public static void main(String[] args) {
        // declaration
        IsomorphicStrings2 solution = new IsomorphicStrings2();
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
