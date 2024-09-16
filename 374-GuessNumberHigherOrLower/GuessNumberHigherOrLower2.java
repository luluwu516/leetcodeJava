import java.util.Scanner;

public class GuessNumberHigherOrLower2 {
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
        return guessNumberRec(1, n);
    }

    public int guessNumberRec(int low, int high) {
        int mid = low + (high - low) / 2;
        int res = guess(mid);
        if (res == 0) {
            return mid;
        } else if (res > 0) {
            return guessNumberRec(mid + 1, high);
        } else {
            return guessNumberRec(low, mid - 1);
        }
    }

    public static void main(String args[]) {
        // declaration
        GuessNumberHigherOrLower2 s = new GuessNumberHigherOrLower2();
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
