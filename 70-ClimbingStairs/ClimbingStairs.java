import java.util.Scanner;

public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n < 2) {
            return 1;
        }

        int prev = 1, curr = 1;

        for (int i = 2; i < n + 1; i++) {
            int temp = curr;
            curr += prev;
            prev = temp;
        }

        return curr;
    }

    public static void main(String[] args) {
        // declaration
        ClimbingStairs c = new ClimbingStairs();
        Scanner in = new Scanner(System.in);
        int num, result;

        // input
        System.out.print("\nEnter how many steps in a staircase: ");
        num = in.nextInt();

        // processing
        result = c.climbStairs(num);

        // output
        System.out.println("\n\nResult:");
        System.out.printf("There are %d ways to climb to the top.\n\n", result);
    }
}
