import java.util.Scanner;

public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        for (long i = 0; i <= num; i++) {
            if (i * i == num) {
                return true;
            } else if (i * i > num) {
                return false;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        // declaration
        ValidPerfectSquare s = new ValidPerfectSquare();
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
