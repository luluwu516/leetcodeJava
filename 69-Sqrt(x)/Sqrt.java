import java.util.Scanner;

public class Sqrt {
    public int mySqrt(int x) {
        if (x <= 1) {
            return x;
        }
        int i;

        for (i = 1; i < x; i++) {
            if (x / i < i) {
                return i - 1;
            }
        }
        return i - 1;
    }

    public static void main(String[] args) {
        // declaration
        Sqrt s = new Sqrt();
        Scanner in = new Scanner(System.in);
        int num, result;

        // input
        System.out.print("\nEnter a positive integer: ");
        num = in.nextInt();

        // processing
        result = s.mySqrt(num);

        // output
        System.out.println("\n\nResult:");
        System.out.printf("The square root of %d is %d\n\n", num, result);
    }
}
