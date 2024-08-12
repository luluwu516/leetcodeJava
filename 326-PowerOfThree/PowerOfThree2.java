import java.util.Scanner;

public class PowerOfThree2 {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        if (n % 3 != 0) {
            return false;
        }

        return isPowerOfThree(n / 3);
    }

    public static void main(String args[]) {
        // declaration
        PowerOfThree2 s = new PowerOfThree2();
        Scanner in = new Scanner(System.in);
        int num;
        Boolean res;

        // input
        System.out.print("Enter a number: ");
        num = in.nextInt();

        // processing
        res = s.isPowerOfThree(num);

        // output
        System.out.println("\nResult: ");
        System.out.printf("The number is %sa power of three\n", (res ? "" : "not "));
    }
}
