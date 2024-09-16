import java.util.Scanner;

public class GuessNumberHigherOrLower {
    private int pick;

    public void setPick(int num) {
        pick = num;
    }

    public int guess(int num) {
        if (num == pick) {
            return 0;
        } else if (num > pick) {
            return -1;
        } else {
            return 1;
        }
    }

    public int guessNumber(int n) {
        int low = 0, high = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int res = guess(mid);
            if (res == 0) {
                return mid;
            } else if (res > 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        // declaration
        GuessNumberHigherOrLower s = new GuessNumberHigherOrLower();
        Scanner in = new Scanner(System.in);
        int num, res;
        System.out.print("\nEnter the pick: ");
        num = in.nextInt();
        s.setPick(num);

        // input
        System.out.print("Enter a number: ");
        num = in.nextInt();

        // processing
        res = s.guessNumber(num);

        // output
        System.out.println("\nResult: ");
        System.out.printf("The pick number is %d\n\n", res);
    }
}
