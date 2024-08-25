import java.util.Scanner;

public class PowerOfFour2 {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        if (n % 4 != 0) {
            return false;
        }

        return isPowerOfFour(n / 4);
    }

    public static void main(String args[]) {
        // declaration
        PowerOfFour2 s = new PowerOfFour2();
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