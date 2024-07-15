import java.util.Scanner;

public class UglyNumber2 {
    public boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        } else if (n == 1) {
            return true;
        } else if (n % 2 == 0) {
            return isUgly(n / 2);
        } else if (n % 3 == 0) {
            return isUgly(n / 3);
        } else if (n % 5 == 0) {
            return isUgly(n / 5);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        // declaration
        UglyNumber2 s = new UglyNumber2();
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
