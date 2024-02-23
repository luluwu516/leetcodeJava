import java.util.ArrayList;
import java.util.Scanner;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        } else if (strs.length == 1) {
            return strs[0];
        }

        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[0].charAt(i) != strs[j].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
        }

        return strs[0];
    }

    static public void main(String arg[]) {
        // Declaration
        LongestCommonPrefix l = new LongestCommonPrefix();
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
