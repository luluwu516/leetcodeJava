public class WordPattern2 {
    
}

import java.util.HashMap;
import java.util.Scanner;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        int patternLen = pattern.length(), wordsLen = words.length;
        if (patternLen != wordsLen) {
            return false;
        }
        HashMap<Character, String> hmap = new HashMap<Character, String>();

        for (int i = 0; i < patternLen; i++) {
            if (!hmap.containsKey(pattern.charAt(i))) {
                if (hmap.containsValue(words[i])) {
                    return false;
                }
                hmap.put(pattern.charAt(i), words[i]);
            } else {
                if (!hmap.get(pattern.charAt(i)).equals(words[i])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // declaration
        WordPattern2 s = new WordPattern2();
        Scanner in = new Scanner(System.in);
        String pattern, words;
        Boolean res;

        // input
        System.out.print("\nEnter pattern (seperated by space): ");
        pattern = in.nextLine();
        System.out.print("Enter words (seperated by space): ");
        words = in.nextLine();

        // processing
        res = s.wordPattern(pattern, words);

        // output
        System.out.println("\n\nResult:");
        System.out.printf("The pattern and words are%s match\n\n", (res ? "" : " not"));
    }
}
