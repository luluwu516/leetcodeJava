import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger {
    public int romanToInt(String s) {
        HashMap<Character, Integer> roman_to_int = new HashMap<>();
        roman_to_int.put('I', 1);
        roman_to_int.put('V', 5);
        roman_to_int.put('X', 10);
        roman_to_int.put('L', 50);
        roman_to_int.put('C', 100);
        roman_to_int.put('D', 500);
        roman_to_int.put('M', 1000);

        int sum = roman_to_int.get(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == 'V' && s.charAt(i - 1) == 'I') {
                sum -= 2;
            } else if (s.charAt(i) == 'X' && s.charAt(i - 1) == 'I') {
                sum -= 2;
            } else if (s.charAt(i) == 'L' && s.charAt(i - 1) == 'X') {
                sum -= 20;
            } else if (s.charAt(i) == 'C' && s.charAt(i - 1) == 'X') {
                sum -= 20;
            } else if (s.charAt(i) == 'D' && s.charAt(i - 1) == 'C') {
                sum -= 200;
            } else if (s.charAt(i) == 'M' && s.charAt(i - 1) == 'C') {
                sum -= 200;
            }
            sum += roman_to_int.get(s.charAt(i));
        }

        return sum;
    }

    public static void main(String arg[]) {
        // Declaration
        RomanToInteger r = new RomanToInteger();
        Scanner in = new Scanner(System.in);
        String roman_numeral;

        // Input
        System.out.print("Enter Roman numeral (I, V, X, L, C, D, or M): ");
        roman_numeral = in.nextLine();

        // Processing and Output
        System.out.printf("\nResult: %d\n", r.romanToInt(roman_numeral));
    }
}
