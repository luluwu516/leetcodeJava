import java.util.Scanner;
import java.util.ArrayList;

public class RansomNote2 {
    Boolean canConstruct(String ransomNote, String magazine) {
        int letters[] = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            letters[magazine.charAt(i) - 97] += 1;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            letters[ransomNote.charAt(i) - 97] -= 1;
            if (letters[ransomNote.charAt(i) - 97] < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        // declaration
        RansomNote2 s = new RansomNote2();
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
