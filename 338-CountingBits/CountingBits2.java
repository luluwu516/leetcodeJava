import java.util.Scanner;

public class CountingBits2 {
    public int[] countBits(int n) {
        int res[] = new int[n + 1];
        int count, num;
        for (int i = 0; i < n + 1; i++) {
            num = i;
            count = 0;
            while (num > 0) {
                num = num & (num - 1);
                count++;
            }
            res[i] = count;
        }
        return res;
    }

    public static void main(String[] args) {
        // declaration
        CountingBits2 s = new CountingBits2();
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
