import java.util.Scanner;

public class AddDigits3 {
    public int addDigits(int num) {
        while (num > 9) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }

    public static void main(String[] args) {
        // declaration
        AddDigits3 s = new AddDigits3();
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
