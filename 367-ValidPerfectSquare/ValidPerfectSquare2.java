import java.util.Scanner;

public class ValidPerfectSquare2 {
    public boolean isPerfectSquare(int num) {
        long low = 0, high = num;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            long square = mid * mid;
            if (square == num) {
                return true;
            } else if (square > num) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        // declaration
        ValidPerfectSquare2 s = new ValidPerfectSquare2();
        Scanner in = new Scanner(System.in);
        int num;
        boolean res;

        // input
        System.out.print("\nEnter a number: ");
        num = in.nextInt();

        // processing
        res = s.isPerfectSquare(num);

        // output
        System.out.println("\nResult: ");
        System.out.printf("%d is %sa perfect square\n\n", num, (res ? "" : "not "));
    }
}
