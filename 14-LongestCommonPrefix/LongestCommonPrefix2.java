import java.util.ArrayList;
import java.util.Scanner;

public class LongestCommonPrefix2 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        } else if (strs.length == 1) {
            return strs[0];
        }

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            int count = 0;
            while (count < prefix.length() && count < strs[i].length() &&
                    prefix.charAt(count) == strs[i].charAt(count)) {
                count++;
            }
            prefix = prefix.substring(0, count);
            if (prefix.isEmpty()) {
                break;
            }
        }

        return prefix;
    }

    static public void main(String arg[]) {
        // Declaration
        LongestCommonPrefix2 l = new LongestCommonPrefix2();
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
