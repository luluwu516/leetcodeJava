import java.util.Scanner;

public class CountingBits3 {
    public int[] countBits(int n) {
        int res[] = new int[n + 1];

        for (int i = 1; i < n + 1; i++) {
            res[i] = 1 + res[i & (i - 1)];
        }
        return res;
    }

    public static void main(String[] args) {
        // declaration
        CountingBits3 s = new CountingBits3();
        Scanner in = new Scanner(System.in);
        int n;

        // input
        System.out.print("\nEnter an integer: ");
        n = in.nextInt();

        // processing
        int res[] = s.countBits(n);

        // output
        System.out.println("\nResult:");
        for (int num : res) {
            System.out.printf("%d ", num);
        }
        System.out.println("\n");
    }
}
