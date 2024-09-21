import java.util.Scanner;
import java.util.HashMap;

public class RansomNote {
    Boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            if (hash.containsKey(c)) {
                int count = hash.get(c) + 1;
                hash.put(c, count);
            } else {
                hash.put(c, 1);
            }
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            if (hash.containsKey(c)) {
                int count = hash.get(c) - 1;
                if (count < 0) {
                    return false;
                } 
                hash.put(c, count);
            } else {
                return false;
            }
        }

        return true;
        // for (int i = 0; i < ransomNote.length(); i++) {
        //     char c = ransomNote.charAt(i);
        //     if (hash.containsKey(c)) {
        //         int count = hash.get(c) + 1;
        //         hash.put(c, count);
        //     } else {
        //         hash.put(c, 1);
        //     }
        // }

        // for (int i = 0; i < magazine.length(); i++) {
        //     char c = magazine.charAt(i);
        //     if (hash.containsKey(c)) {
        //         int count = hash.get(c) - 1;
        //         hash.put(c, count);
        //     }
        // }

        // for (int count : hash.values()) {
        //     if (count > 0) {
        //         return false;
        //     }
        // }
        // return true;
    }

    public static void main(String args[]) {
        // declaration
        RansomNote s = new RansomNote();
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
