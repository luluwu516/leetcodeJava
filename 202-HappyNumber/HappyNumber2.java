import java.util.Scanner;
import java.util.HashSet;

public class HappyNumber2 {
    public boolean isHappy(int n) {
        int slow = sumOfSquare(n);
        int fast = sumOfSquare(sumOfSquare(n));
        while (fast != 1 && fast != slow) {
            slow = sumOfSquare(slow);
            fast = sumOfSquare(sumOfSquare(fast));
        }

        return fast == 1;
    }

    public int sumOfSquare(int n) {
        int sum = 0;
        int digit;
        while (n > 0) {
            digit = n % 10;
            sum += (digit * digit);
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        // declaration
        HappyNumber2 s = new HappyNumber2();
        Scanner in = new Scanner(System.in);
        int num;
        Boolean res;

        // input
        System.out.print("Enter a number: ");
        num = in.nextInt();

        // processing
        res = s.isHappy(num);

        // output
        System.out.println("\nResult: ");
        System.out.printf("The number is %s\n", (res ? "a happy number" : "not a happy number"));
    }
}
