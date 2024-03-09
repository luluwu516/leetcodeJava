import java.util.Scanner;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                ++digits[i];
                return digits;
            } else {
                digits[i] = 0;
            }
        }

        int plus[] = new int[digits.length + 1];
        plus[0] = 1;
        for (int i = 1; i < plus.length; i++) {
            plus[i] = digits[i - 1];
        }

        return plus;
    }

    public static void main(String[] args) {
        // declaration
        PlusOne p = new PlusOne();
        Scanner in = new Scanner(System.in);
        int size;

        // input
        System.out.print("Enter the number of the digits: ");
        size = in.nextInt();

        int[] digits = new int[size];

        System.out.println("Enter each digit: ");
        for (int i = 0; i < size; i++) {
            System.out.print("> ");
            digits[i] = in.nextInt();
        }

        // processing
        int[] result = p.plusOne(digits);

        // output
        System.out.println("\n\nResult:");
        System.out.printf("The number plus one is: [ ", result);
        for (int i = 0; i < result.length; i++) {
            System.out.printf("%d ", digits[i]);
        }
        System.out.println("]\n");
    }
}
