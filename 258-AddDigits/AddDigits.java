import java.util.Scanner;

public class AddDigits {
    public int addDigits(int num) {
        if (num == 0) {
            return 0;
        } else if (num % 9 == 0) {
            return 9;
        } else {
            return num % 9;
        }
    }

    public static void main(String[] args) {
        // declaration
        AddDigits s = new AddDigits();
        Scanner in = new Scanner(System.in);
        int num, res;

        // input
        System.out.print("\nEnter an integer: ");
        num = in.nextInt();

        // processing
        res = s.addDigits(num);

        // output
        System.out.println("\nAfter repeatedly adding all its digits until the result has only one digit:");
        System.out.printf("Result: %d\n\n", res);
    }
}
