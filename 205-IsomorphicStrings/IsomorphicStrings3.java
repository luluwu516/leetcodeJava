import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IsomorphicStrings3 {
    public Boolean isIsomorphic(String s, String t) {
        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char cS = s.charAt(i);
            char cT = t.charAt(i);

            if (mapS.containsKey(cS)) {
                if (mapS.get(cS) != mapT.get(cT)) {
                    return false;
                }
            } else {
                if (mapT.containsKey(cT)) {
                    return false;
                }
                mapS.put(cS, i);
                mapT.put(cT, i);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // declaration
        IsomorphicStrings3 solution = new IsomorphicStrings3();
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
