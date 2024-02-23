import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LongestCommonPrefix3 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        } else if (strs.length == 1) {
            return strs[0];
        }
        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length - 1];
        String prefix = "";

        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) == last.charAt(i)) {
                prefix = first.substring(0, i + 1);
            } else {
                return prefix;
            }
        }

        return prefix;
    }

    static public void main(String arg[]) {
        // Declaration
        LongestCommonPrefix3 l = new LongestCommonPrefix3();
        Scanner in = new Scanner(System.in);
        ArrayList<String> strs = new ArrayList<String>();
        String input = "", result;

        // Input
        System.out.println("Enter a list of strings separated by new line, -1 to stop: ");
        while (!input.equals("-1")) {
            System.out.print("> ");
            input = in.nextLine();
            if (!input.equals("-1")) {
                strs.add(input);
            }
        }

        String[] strs_array = new String[strs.size()];
        int index = 0;
        for (String str : strs) {
            strs_array[index] = str;
            index++;
        }

        result = l.longestCommonPrefix(strs_array);
        System.out.println("\nResult: " + result);
    }
}
