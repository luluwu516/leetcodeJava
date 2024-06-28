import java.util.Scanner;

public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }

        while (n != 1) {
            if (n % 2 == 1) {
                return false;
            }
            n /= 2;
        }
        return true;
    }

    public static void main(String args[]) {
        // declaration
        PowerOfTwo s = new PowerOfTwo();
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
