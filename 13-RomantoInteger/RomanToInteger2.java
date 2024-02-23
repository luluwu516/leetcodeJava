import java.util.Scanner;

public class RomanToInteger2 {
    public int romanToInt(String s) {
        int answer = 0, number = 0, prev = 0;

        for (int j = s.length() - 1; j >= 0; j--) {
            switch (s.charAt(j)) {
                case 'I':
                    number = 1;
                    break;
                case 'V':
                    number = 5;
                    break;
                case 'X':
                    number = 10;
                    break;
                case 'L':
                    number = 50;
                    break;
                case 'C':
                    number = 100;
                    break;
                case 'D':
                    number = 500;
                    break;
                case 'M':
                    number = 1000;
                    break;
                default:
                    number = 0;
                    break;
            }

            // Another way
            // switch (s.charAt(j)) {
            // case 'M' -> number = 1000;
            // case 'D' -> number = 500;
            // case 'C' -> number = 100;
            // case 'L' -> number = 50;
            // case 'X' -> number = 10;
            // case 'V' -> number = 5;
            // case 'I' -> number = 1;
            // }

            if (number < prev) {
                answer -= number;
            } else {
                answer += number;
            }
            prev = number;
        }
        return answer;
    }

    public static void main(String arg[]) {
        // Declaration
        RomanToInteger2 r = new RomanToInteger2();
        Scanner in = new Scanner(System.in);
        String roman_numeral;

        // Input
        System.out.print("Enter Roman numeral (I, V, X, L, C, D, or M): ");
        roman_numeral = in.nextLine();

        // Processing and Output
        System.out.printf("\nResult: %d\n", r.romanToInt(roman_numeral));
    }
}
