import java.util.Scanner;
import java.util.HashSet;

public class HappyNumber {
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<Integer>();
        int sum = 0, digit;
        while (sum != 1) {
            sum = 0;
            while (n > 0) {
                digit = n % 10;
                sum += (digit * digit);
                n /= 10;
            }
            if (sum == 1) {
                return true;
            }
            if (seen.contains(sum)) {
                return false;
            }
            seen.add(sum);
            n = sum;
        }
        return true;
    }

    public static void main(String[] args) {
        // declaration
        HappyNumber s = new HappyNumber();
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
