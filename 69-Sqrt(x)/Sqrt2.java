import java.util.Scanner;

public class Sqrt2 {
    public int mySqrt(int x) {
        if (x <= 1) {
            return x;
        }

        int left = 1, right = x;
        int mid, divide;

        while (left < right) {
            mid = (left + right) / 2 + 1;
            divide = x / mid;

            if (divide == mid) {
                return mid;
            } else if (divide > mid) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        // declaration
        Sqrt2 s = new Sqrt2();
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
