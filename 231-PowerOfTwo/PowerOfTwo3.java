import java.util.Scanner;

public class PowerOfTwo3 {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        } else {
            return (n & (n - 1)) == 0;
        }
    }

    public static void main(String args[]) {
        // declaration
        PowerOfTwo3 s = new PowerOfTwo3();
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
