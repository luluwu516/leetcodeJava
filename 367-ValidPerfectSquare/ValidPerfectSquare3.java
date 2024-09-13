import java.util.Scanner;

public class ValidPerfectSquare3 {
    public boolean isPerfectSquare(int num) {
        if (Math.sqrt(num) % 1 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        // declaration
        ValidPerfectSquare3 s = new ValidPerfectSquare3();
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
