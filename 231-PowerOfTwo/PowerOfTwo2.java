import java.util.Scanner;

public class PowerOfTwo2 {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        if (n % 2 == 1) {
            return false;
        }

        return isPowerOfTwo(n / 2);
    }

    public static void main(String args[]) {
        // declaration
        PowerOfTwo2 s = new PowerOfTwo2();
        Scanner in = new Scanner(System.in);
        int num;
        Boolean res;

        // input
        System.out.print("Enter a number: ");
        num = in.nextInt();

        // processing
        res = s.isPowerOfTwo(num);

        // output
        System.out.println("\nResult: ");
        System.out.printf("The number is %sa power of two\n", (res ? "" : "not "));
    }
}
