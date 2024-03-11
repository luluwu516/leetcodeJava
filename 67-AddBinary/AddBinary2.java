import java.util.Scanner;

public class AddBinary2 {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        int digitA, digitB, sum;

        while (i >= 0 || j >= 0 || carry > 0) {
            if (i >= 0) {
                digitA = a.charAt(i) - '0';
            } else {
                digitA = 0;
            }

            if (j >= 0) {
                digitB = b.charAt(j) - '0';
            } else {
                digitB = 0;
            }

            sum = digitA + digitB + carry;
            carry = sum / 2;
            sum = sum % 2;

            result.insert(0, sum);
            i--;
            j--;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // declaration
        AddBinary2 a = new AddBinary2();
        Scanner in = new Scanner(System.in);
        String digits_a, digits_b;
        String result;

        // input
        System.out.print("\nEnter a binary number: ");
        digits_a = in.next();

        System.out.print("Enter another binary number: ");
        digits_b = in.next();

        // processing
        result = a.addBinary(digits_a, digits_b);

        // output
        System.out.println("\n\nResult:");
        System.out.printf("The sum of two binary numbers is: %s\n\n", result);
    }
}
