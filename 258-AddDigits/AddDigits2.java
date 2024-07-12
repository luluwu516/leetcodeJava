import java.util.Scanner;

public class AddDigits2 {
    public int addDigits(int num) {
        if (num < 10) {
            return num;
        }
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return addDigits(sum);
    }

    public static void main(String[] args) {
        // declaration
        AddDigits2 s = new AddDigits2();
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
