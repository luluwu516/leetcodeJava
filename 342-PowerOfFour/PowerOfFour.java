import java.util.Scanner;

public class PowerOfFour {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }

        while (n % 4 == 0) {
            n /= 4;
        }
        return n == 1;
    }

    public static void main(String args[]) {
        // declaration
        PowerOfFour s = new PowerOfFour();
        Scanner in = new Scanner(System.in);
        int num;
        Boolean res;

        // input
        System.out.print("Enter a number: ");
        num = in.nextInt();

        // processing
        res = s.isPowerOfFour(num);

        // output
        System.out.println("\nResult: ");
        System.out.printf("The number is %sa power of three\n", (res ? "" : "not "));
    }
}
