import java.util.HashMap;
import java.util.Scanner;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        int patternLen = pattern.length(), wordsLen = words.length;
        if (patternLen != wordsLen) {
            return false;
        }
        HashMap<Character, String> hmap_pattern = new HashMap<Character, String>();
        HashMap<String, Character> hmap_words = new HashMap<String, Character>();

        for (int i = 0; i < patternLen; i++) {
            if (!hmap_pattern.containsKey(pattern.charAt(i))) {
                hmap_pattern.put(pattern.charAt(i), words[i]);
            } else {
                if (!hmap_pattern.get(pattern.charAt(i)).equals(words[i])) {
                    return false;
                }
            }
            if (!hmap_words.containsKey(words[i])) {
                hmap_words.put(words[i], pattern.charAt(i));
            } else {
                if (!hmap_words.get(words[i]).equals(pattern.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // declaration
        WordPattern s = new WordPattern();
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
