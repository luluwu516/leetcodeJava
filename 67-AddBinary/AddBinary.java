import java.util.Scanner;

public class AddBinary {
    public String addBinary(String a, String b) {
        String result = new String();
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
            result = sum % 2 + result;

            i--;
            j--;
        }
        if (carry != 0) {
            result = "1" + result;
        }

        return result;
    }

    public static void main(String[] args) {
        // declaration
        AddBinary a = new AddBinary();
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
