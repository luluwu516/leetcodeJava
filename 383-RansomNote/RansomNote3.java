import java.util.HashMap;
import java.util.Scanner;

public class RansomNote3 {
    Boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> hash = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            hash.put(c, hash.getOrDefault(c, 0) + 1);
        }
        for (char c : ransomNote.toCharArray()) {
            if (hash.get(c) != null && hash.get(c) != 0) {
                hash.put(c, hash.getOrDefault(c, 0) - 1);
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        // declaration
        RansomNote3 s = new RansomNote3();
        Scanner in = new Scanner(System.in);
        String ransomNote, magazine;
        Boolean res;

        // input
        System.out.print("\nEnter ransom note: ");
        ransomNote = in.nextLine();
        System.out.print("Enter magazine: ");
        magazine = in.nextLine();

        // processing
        res = s.canConstruct(ransomNote, magazine);

        // output
        System.out.println("\nResult: ");
        System.out.printf("Each letter in magazine can%s only be used once in ransom note\n\n", (res ? "" : " not"));
    }
}
