import java.util.Scanner;

public class UglyNumber {
    public boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 2 == 0) {
            n /= 2;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        while (n % 5 == 0) {
            n /= 5;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        // declaration
        UglyNumber s = new UglyNumber();
        Scanner in = new Scanner(System.in);
        int num;
        boolean res;

        // input
        System.out.print("\nEnter an integer: ");
        num = in.nextInt();

        // processing
        res = s.isUgly(num);

        // output
        System.out.println("\nResult:");
        System.out.printf("The integer is%s a ugly number.\n\n", (res ? "" : " not"));
    }
}
